package com.pauloaceroweb.ejercicios789;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class EjercicioLibre {

    public static void main(String[] args) {
        // Mapa con valores dados.
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);
        mapa.put("clave5", 50);

        try {
            // Creamos un archivo con el nombre especificado.
            PrintStream out = new PrintStream("fileFree.txt");
            out.print(mapa);
            out.close();

            // Leemos el fichero.
            InputStream archivo = new FileInputStream("fileFree.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(archivo);

            // Imprime en líneas.
            System.out.println("********** Se lee el Archivo creado **********");
            int dato = fileBuffer.read();
            while (dato != -1) {
                System.out.print((char) dato);
                dato = fileBuffer.read();
            }

            // Leemos el archivo con un ArrayList
            try {
                System.out.println("\n********** Leemos el Archivo con un ArrayList **********");
                ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("fileFree.txt")));
                System.out.println("Leer Con ArrayList: " + lines);
            }
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
