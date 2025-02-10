/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_copia_arreglo;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_12_COPIA_ARREGLO {

    public static void main(String[] args) {
        int datos[] = new int[10];
        System.out.println(datos);
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int) (Math.random() * 100);
        }
        for(int valor: datos){
            System.out.print("[" + valor + "]");
        }
        System.out.println("");
        int copia[] = new int[10];
        for(int i = 0; i < datos.length; i++){
            copia[i] = datos[i];
        }
        for(int valor: copia){
            System.out.print("[" + valor + "]");
        }
          System.out.println("");
        System.out.println(copia);
    }
}
