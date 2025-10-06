package curso_fundamentos_archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Curso_Fundamentos_Archivos {

    public static void main(String[] args) {
        // Nombre del archivo que ud  nos dio en el anuncio.
        String fileName = "my_notes.txt";

        // La  ruta donde quiero que se guarde
        System.out.println("Ruta del archivo: " + new File(fileName).getAbsolutePath());

        // Aqui se crea y se escribe las lineas de texto 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Linea 1: Nota personal sobre el curso de Fundamentos.\n");
            writer.write("Linea 2: Practicar lectura y escritura de archivos en Java.\n");
            writer.write("Linea 3: Revisar excepciones y cerrar recursos correctamente.\n");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
            return;
        }

        // Aqui es donde se verifica si esta el archivo.
        File file = new File(fileName);
        if (!file.exists()) {
            System.err.println("El archivo no existe: " + fileName);
            return;
        }

        // Aqui es donde lee y lo plasma de manera ordenada o bueno como en el ejemplo de python que esta !
        System.out.println("\nContenido de " + fileName + " leido linea por linea:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            int numero = 1;
            while ((linea = reader.readLine()) != null) {
                System.out.println("Linea " + numero + ": " + linea);
                numero++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Aqui manda un mensaje de que si todo salio bien se cierra.
        System.out.println("\nOperacion completada. Archivos cerrados correctamente.");
    }
}
