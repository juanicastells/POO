package com.example.demo.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MaterialEducativo;
import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;


@Service
public class UsuarioBusiness{
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario insertUsuario(Usuario usuario) {
        usuario.setPass(passwordEncoder().encode(usuario.getPass()));
        return usuarioRepository.save(usuario);
    }

    //elimina por mail
    public void deleteUsuario(String usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

    public Usuario actualizarNombreUsuario(String usuarioId, String nuevoNombre) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setApellidoNombre(nuevoNombre);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

     public Usuario actualizarDatosUsuario(String usuarioId, String nuevoNombre, String nuevoTelefono, Rol nuevoRol) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setApellidoNombre(nuevoNombre);
            usuario.setTelefono(nuevoTelefono);
            usuario.setRol(nuevoRol);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

    public Usuario asignarRol (String usuarioId, Rol rol) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario != null) {
            usuario.setRol(rol);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

    public void bajaUsuario (String mail){
        usuarioRepository.deleteById(mail);
    }

    public Usuario obtenerPorMail(String mail) {//optional es un contendor que puede o no contener un valor null.
        Optional <Usuario> usuarioOptional = usuarioRepository.findById(mail);
        if (usuarioOptional.isEmpty()){
            return null;
        }
        return usuarioOptional.get();
    }
   
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    public Usuario asignarMaterial (String mail, MaterialEducativo material){
        Usuario usuario = new Usuario();
        usuario = usuarioRepository.findBymail(mail);
        usuario.setMaterialEducativo(material);
        return usuarioRepository.save(usuario);
    }
    
}
