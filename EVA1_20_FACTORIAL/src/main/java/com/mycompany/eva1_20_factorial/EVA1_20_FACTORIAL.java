/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_factorial;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_20_FACTORIAL {

    public static void main(String[] args) {
        /*int factorial = 1;   // es mejor resolver el factorial con ciclos que con recursividad 
        for (int i = 5; i > 0; i--){
            factorial = factorial * i;
        } */
        int factorial = calculaFactorial(5);
        System.out.print("el factorial de 5 es: " + factorial);
        
    }
    
    public static int calculaFactorial(int num){
        //forma de resolver el problema
        //manera de detener la recursividad
        //recursividad
        if (num == 0)
            return 1;
        return num * calculaFactorial(num - 1);
    }
}
