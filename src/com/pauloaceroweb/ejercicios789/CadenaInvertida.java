package com.pauloaceroweb.ejercicios789;

import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {

        String texto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        texto = scanner.nextLine();

        if (!texto.isEmpty()) {
            System.out.println("El texto original es: " + texto);
            System.out.println("El texto invertido es: " + reverse(texto));
        } else {
            System.out.println("No ha ingresado una cadena de texto");
        }

    }

    public static String reverse(String texto) {
        StringBuilder textoInvertido = new StringBuilder();
        for (int i = texto.length()-1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }
}
