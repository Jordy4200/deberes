/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculardescuento;

import java.util.Scanner;

/**
 *
 * @author Brad
 */
public class CalcularDescuento {

    // Calculo
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        double descuento = montoTotal * (porcentajeDescuento / 100);
        return descuento;
    }

    // Sobrecarga: usa 10% por defecto
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Porcentaje utilizado(10%)
        System.out.print("Ingrese el monto total de la primera compra: ");
        double monto1 = sc.nextDouble();
        double descuento1 = calcularDescuento(monto1);
        double totalPagar1 = monto1 - descuento1;

        //  2️⃣ Porcentaje personalizado
        System.out.print("Ingrese el monto total de la segunda compra: ");
        double monto2 = sc.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentaje2 = sc.nextDouble();
        double descuento2 = calcularDescuento(monto2, porcentaje2);
        double totalPagar2 = monto2 - descuento2;

        // --- Resultados ---
        System.out.println("\n=== Compra 1 ===");
        System.out.println("Monto total: $" + monto1);
        System.out.println("Descuento aplicado (10%): $" + descuento1);
        System.out.println("Total a pagar: $" + totalPagar1);

        System.out.println("\n=== Compra 2 ===");
        System.out.println("Monto total: $" + monto2);
        System.out.println("Descuento aplicado (" + porcentaje2 + "%): $" + descuento2);
        System.out.println("Total a pagar: $" + totalPagar2);
    }
}
