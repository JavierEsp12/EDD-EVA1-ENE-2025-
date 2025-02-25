/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_fibonacci;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
import java.util.Scanner;

public class EVA1_22_FIBONACCI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Numero de posición: ");
        int num = scanner.nextInt();
        int fibo = fibonacci(num + 1);
        System.out.println("El fibonacci de la posicion " + num + " es: " + fibo);
    }
    
    public static int fibonacci(int val){
        //forma de resolver el problema
        //manera de detener la recursividad
        //recursividad
        if (val <= 1) { // Caso base: si val es 0 o 1, se devuelve val
            return val;
        } else {
            return fibonacci(val - 1) + fibonacci(val - 2);
        }
    }
}
