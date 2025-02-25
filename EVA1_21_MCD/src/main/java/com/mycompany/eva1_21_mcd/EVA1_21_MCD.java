/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_mcd;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_21_MCD {

    public static void main(String[] args) {
        int n1 = 180;
        int n2 = 48;
        int mcd = calculaMCD(n1, n2);
        System.out.println("El maximo cumun divisor de 180 y 48 es: " + mcd);
    }
    
    public static int calculaMCD(int val1, int val2){
        //forma de resolver el problema
        //manera de detener la recursividad
        //recursividad
        if (val2 == 0)
            return val1;
        return calculaMCD(val2, val1 % val2);
    }
}
