package com.pauloaceroweb.ejercicios789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ficheros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el archivo de origen: fileIn.txt");
        String fileIn = scanner.nextLine();
        System.out.println("Ingrese el nombre del archivo de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);
    }

    private static void copiar(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
            System.out.println("Se copio el archivo satisfactoriamente!!");
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }


}
