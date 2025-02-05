/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_arreglos;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_5_ARREGLOS {

    public static void main(String[] args) {
        int[] datos = new int[10]; //la palabra new significa que es un objeto
        //int[] a, b, c,; //tres areglos de tipo entero
        //int[] a, b[], c,; //un arreglo de tipo entero
        //ACCESO ALEATORIO (POR INDICES)
        datos[0] = 100;
        datos[1] = 200;
        datos[9] = 1000;
        //datos[10] = 1000; //GENERA EXCEPCION (LLEGA HASTA 9)
        //uso de ciclos para manejar arreglos;
        for (int i = 0; i < 10; i++) {  // la "i" viene de la palabra INDICE
            datos[i] = 100;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + datos[i] + "]");
        }
    }
}
