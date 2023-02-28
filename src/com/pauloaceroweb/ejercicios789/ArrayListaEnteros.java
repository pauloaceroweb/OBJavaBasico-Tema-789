package com.pauloaceroweb.ejercicios789;

import java.util.ArrayList;

public class ArrayListaEnteros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++ ) {
            numeros.add(i);

            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(j) % 2 == 0) {
                    numeros.remove(j);
                }
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Número impares de 1 al 10: " + numeros);
        System.out.println("-------------------------------------------");
    }
}
