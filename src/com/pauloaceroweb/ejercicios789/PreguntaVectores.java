package com.pauloaceroweb.ejercicios789;

public class PreguntaVectores {

    public static void main(String[] args) {

        // Pregunta:
        // Indica cuál es el problema de utilizar un Vector con la capacidad
        // por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        // Respuesta:
        // Se sobrecargan los recursos computacionales de memoria porque se duplica la
        // dimensión del vector cada vez que se supera la capacidad por defecto de 10.
        // Para evitar este problema podemos cambiar la capacidad de nuestro vector
        // inicial a lo más cercano de las necesidades de nuestro proyecto.

        System.out.println("-");
        System.out.println("************** PREGUNTA **************" );
        System.out.println("Indica cuál es el problema de utilizar un Vector con la capacidad" +
                           " \npor defecto si tuviésemos 1000 elementos para ser añadidos al mismo. " );
        System.out.println("-");
        System.out.println("************** RESPUESTA **************" );
        System.out.println(
                "Se sobrecargan los recursos computacionales de memoria porque se duplica la" +
                " \ndimensión del vector cada vez que se supera la capacidad por defecto de 10." +
                " \nPara evitar este problema podemos cambiar la capacidad de nuestro vector" +
                " \ninicial a lo más cercano de las necesidades de nuestro proyecto." );

    }
}
