/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrotemperaturas;

/**
 *
 * @author Brad
 */
public class RegistroTemperaturas {

    public static void main(String[] args) {
        
        // Nombres de ciudades y días 
        String[] ciudades = {"Quito", "Guayaquil", "Cuenca"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        // Matriz 3D: [ciudad][semana][día]
        double[][][] temperaturas = {
            { // Quito
                {15.2, 16.5, 17.0, 18.1, 17.5, 16.8, 15.9}, // Semana 1
                {14.8, 15.9, 16.7, 17.2, 16.5, 15.7, 14.9}  // Semana 2
            },
            { // Guayaquil
                {28.5, 29.0, 30.2, 31.1, 30.8, 29.9, 28.7}, // Semana 1
                {27.9, 28.4, 29.5, 30.0, 29.8, 28.6, 27.5}  // Semana 2
            },
            { // Cuenca
                {12.5, 13.0, 13.8, 14.2, 13.9, 13.1, 12.7}, // Semana 1
                {11.9, 12.4, 13.0, 13.5, 13.2, 12.8, 12.1}  // Semana 2
            }
        };
        
        // Calcular y mostrar promedios
                // Ciudades
        for (int c = 0; c < ciudades.length; c++) { 
            System.out.println("Ciudad: " + ciudades[c]);
                // Semanas
            for (int s = 0; s < temperaturas[c].length; s++) { 
                double suma = 0;
                // Días
                for (int d = 0; d < temperaturas[c][s].length; d++) { 
                    suma += temperaturas[c][s][d];
                }
                
                double promedio = suma / temperaturas[c][s].length;
                System.out.printf("  Semana %d → Promedio: %.2f °C%n", (s + 1), promedio);
            }
            System.out.println();
        }
    }
}
