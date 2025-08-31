/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedamatriz;

/**
 *
 * @author Brad
 */
public class BusquedaMatriz {
    
    public static void main(String[] args) {
        // Crear matriz 3x3
        int[][] matriz = {
            {5, 8, 3},
            {2, 9, 1},
            {7, 4, 6}
        };
        
        // Valor a buscar
        int valorBuscado = 9;
        
        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        // Realizar búsqueda
        buscarValor(matriz, valorBuscado);
    }
    
    public static void buscarValor(int[][] matriz, int valor) {
        boolean encontrado = false;
        int filaEncontrada = -1;
        int columnaEncontrada = -1;
        
        // Recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    encontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    break;
                }
            }
            if (encontrado) break;
        }
        
        // Mostrar resultado
        if (encontrado) {
            System.out.println("\nEl valor " + valor + " se encontro en la posicion:");
            System.out.println("Fila: " + (filaEncontrada + 1) + ", Columna: " + (columnaEncontrada + 1));
        } else {
            System.out.println("\nEl valor " + valor + " no se encontro en la matriz.");
        }
    }
    
    // Función para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

