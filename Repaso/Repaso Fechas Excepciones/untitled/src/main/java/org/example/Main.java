package org.example;
import java.util.Date;
import java.time.LocalDate;
import manejoDeFechas.CalculoFechas;
import manejoDeFechas.noMayorDeEdadException;

public class Main {
    public static void main(String[] args) throws noMayorDeEdadException {
        /*Casting Implícito (Upcasting): Ocurre cuando se convierte un tipo de dato de menor tamaño en uno de mayor
        tamaño. Java realiza este tipo de casting automáticamente, ya que no hay riesgo de pérdida de datos.
        Por ejemplo, puedes asignar un entero a una variable de tipo double pero no al revés:*/

        int entero = 5;
        //System.out.println(entero);
        double decimal = entero; // Casting implícito
        //System.out.println(decimal);

        /*Casting Explícito (Downcasting): Ocurre cuando se convierte un tipo de dato de mayor tamaño
        en uno de menor tamaño. Este tipo de casting debe hacerse de manera explícita y podría resultar
        en la pérdida de datos si el valor original no se puede representar con precisión en el nuevo tipo.
        Por lo tanto, el programador asume la responsabilidad de manejar posibles pérdidas de datos.
        Por ejemplo, convertir un double en un int:
         */

        double n1 = 3.14;
        int n2 = (int) n1;
        //System.out.println(n2);

        /*FECHAS*/
        /*Date es una clase deprecada*/
        Date fechaActual = new Date();
        //System.out.println(fechaActual.getYear());


        /* Como Date es una clase deprecada su sucesora es LocalDate.
        Esta clase representa una fecha sin una hora específica.
        Es útil para trabajar con fechas de manera independiente del tiempo.
        */
        //ESTO DA ERROR LocalDate fechaSinTimepo = new LocalDate();
        /*La clase LocalDate no tiene un constructor público sin argumentos, por lo que no puedes usar
        new LocalDate() para crear una instancia. En su lugar, debes utilizar los métodos estáticos
        proporcionados por la clase para obtener instancias de LocalDate. Por ejemplo:*/

        LocalDate fechaDeNacimiento = LocalDate.of(2010,9,18);
        CalculoFechas fechaACalcular = new CalculoFechas(fechaDeNacimiento);
        int edad = fechaACalcular.calcularEdad();
        System.out.println("Tengo: " + edad + " años ...");

        try {
            if (fechaACalcular.mayorDeEdad()){
                System.out.println("La persona es Mayor de edad ...");
            }
        }catch (noMayorDeEdadException e){
            System.out.println(e.getMessage());
        }

    }
}