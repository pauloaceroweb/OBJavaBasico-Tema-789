package com.pauloaceroweb.ejercicios789;

import java.util.Scanner;

public class DividePorCero {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa los números a dividir: ");
            System.out.print("Numero 1: ");
            int numero1 = scanner.nextInt();
            System.out.print("Numero 2: ");
            int numero2 = scanner.nextInt();
            try {
                System.out.println("Resultado de la división: " + divide(numero1 , numero2));
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }
    }

    private static int divide(int numero1, int numero2) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = numero1 / numero2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }
}
