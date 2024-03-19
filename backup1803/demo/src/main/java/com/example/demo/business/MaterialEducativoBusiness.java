package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MaterialEducativo;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.MaterialEducativoRepository;
import com.example.demo.repository.UsuarioRepository;

@Service
public class MaterialEducativoBusiness {
    
    @Autowired
    MaterialEducativoRepository materialEducativoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioBusiness usuarioBusiness;

    public MaterialEducativo crearNuevoMaterial (String mailAutorMaterial){
        MaterialEducativo nuevoMaterial = new MaterialEducativo();
        usuarioBusiness.asignarMaterial(mailAutorMaterial, nuevoMaterial);
        return materialEducativoRepository.save(nuevoMaterial);
    }

    public MaterialEducativo actualizarMaterialEducativo (Long idMaterial, String nuevoNombre, String nuevaDescripcion) /*MultipartFile documento)*/{
        MaterialEducativo materialEducativo = materialEducativoRepository.findById(idMaterial).orElse(null);
        if (materialEducativo != null) {
            materialEducativo.setNombre(nuevoNombre);
            materialEducativo.setDescripcion(nuevaDescripcion);
            //materialEducativo.setArchivoMaterial(documento);
            return materialEducativoRepository.save(materialEducativo);
        } else {
            return null;
        }
    }
}