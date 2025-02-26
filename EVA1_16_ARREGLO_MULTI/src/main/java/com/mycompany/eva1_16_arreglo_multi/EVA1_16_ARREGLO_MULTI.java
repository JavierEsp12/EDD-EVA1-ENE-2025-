/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_arreglo_multi;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_16_ARREGLO_MULTI {

    public static void main(String[] args) {
        int matriz[][] = new int[5][];
        matriz[0] = new int[6];
        matriz[1] = new int[2];
        matriz[2] = new int[4];
        matriz[3] = new int[7];
        matriz[4] = new int[1];
        // existen 20 enteros
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
