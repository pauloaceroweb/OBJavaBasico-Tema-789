package com.pauloaceroweb.ejercicios789;

import java.util.Vector;

public class EjercicioVector {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Enero");
        vector.add("Febrero");
        vector.add("Marzo");
        vector.add("Abril");
        vector.add("Mayo");

        System.out.println("Vector Original: " + vector);

        vector.remove(1);
        vector.remove(2);

        System.out.println("Resultado final: " + vector);
    }
}
