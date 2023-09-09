package manejoDeFechas;

public class noMayorDeEdadException extends Exception{
    private int edad;

    public noMayorDeEdadException(int edad) {
        this.edad = edad;
    }

    public String getMessage (){
        return "La persona es menor de edad tiene " + edad + " años";
    }

}
