/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacionmatriz;

/**
 *
 * @author Brad
 */
public class OrdenacionMatriz {
    
    public static void main(String[] args) {
        // Crear matriz 3x3
        int[][] matriz = {
            {9, 5, 2},
            {7, 1, 8},
            {3, 6, 4}
        };
        
        // Fila a ordenar 
        int filaAOrdenar = 1; // Segunda fila
        
        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        // Ordenar la fila específica
        ordenarFila(matriz, filaAOrdenar);
        
        // Mostrar matriz con fila ordenada
        System.out.println("\nMatriz con la fila " + (filaAOrdenar + 1) + " ordenada:");
        mostrarMatriz(matriz);
    }
    
    // Función para ordenar una fila
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila < 0 || fila >= matriz.length) {
            System.out.println("Fila inválida");
            return;
        }
        
        int n = matriz[fila].length;
        
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriz[fila][j] > matriz[fila][j + 1]) {
                    // Intercambiar elementos
                    int temp = matriz[fila][j];
                    matriz[fila][j] = matriz[fila][j + 1];
                    matriz[fila][j + 1] = temp;
                }
            }
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
