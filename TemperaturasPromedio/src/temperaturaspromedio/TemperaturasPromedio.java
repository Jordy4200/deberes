/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturaspromedio;

/**
 *
 * @author Brad
 */
public class TemperaturasPromedio {

    /**
     * @param temperaturas 
     * @return Un arreglo con el promedio de cada ciudad.
     */
    public static double[] PromedioPorCiudad(double[][] temperaturas) {
        double[] promedios = new double[temperaturas.length];

        for (int ciudad = 0; ciudad < temperaturas.length; ciudad++) {
            double suma = 0;
            for (int semana = 0; semana < temperaturas[ciudad].length; semana++) {
                suma += temperaturas[ciudad][semana];
            }
            promedios[ciudad] = suma / temperaturas[ciudad].length;
        }

        return promedios;
    }

    public static void main(String[] args) {
        //3 ciudades × 4 semanas
        double[][] datosTemperaturas = {
            {25.5, 26.0, 24.8, 25.2}, // Ciudad 1
            {18.3, 19.0, 17.5, 18.8}, // Ciudad 2
            {30.0, 29.5, 31.2, 30.8}  // Ciudad 3
        };

        double[] promedios = PromedioPorCiudad(datosTemperaturas);

        // Mostrar resultados
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("Ciudad %d - Promedio: %.2f°C%n", i + 1, promedios[i]);
        }
    }
}

