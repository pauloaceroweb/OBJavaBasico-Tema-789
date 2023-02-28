package com.pauloaceroweb.ejercicios789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLista {

    public static void main(String[] args) {

        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Elemento 1");
        elementos.add("Elemento 2");
        elementos.add("Elemento 3");
        elementos.add("Elemento 4");

        System.out.println("-");
        for (String elemento : elementos) {
            System.out.println("Elementos ArrayList: " + elemento);
        }

        LinkedList<String> linkedListas = new LinkedList<>(elementos);

        System.out.println("-");
        for (String linkedList : linkedListas) {
            System.out.println("Elementos LinkedList: " + linkedList);
        }

    }
}
