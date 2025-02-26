/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_falso_for;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_19_FALSO_FOR {

    public static void main(String[] args) {
        //imprimir una lista: 5 - 4 - 3 - 2 - 1
       /* for (int i = 5; i > 0; i--){
            System.out.print(i + " - ");
        } */
        //llamada recursiva
        listaNumerosRecu(5);
    }
    public static void listaNumerosRecu(int valor){
            //codigo para resolver el problema
            System.out.print(valor + " - ");
            if(valor > 1) //con el if controla la detencion de la recursividad 
            listaNumerosRecu(valor - 1);
        }
}
