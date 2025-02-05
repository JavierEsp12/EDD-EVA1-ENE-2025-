/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_arreglos_2;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_6_ARREGLOS_2 {

    public static void main(String[] args) {
        int datos[] = new int[20]; 
        System.out.println(datos); // nos da informacion y direccion del arreglo
        System.out.println(datos.length); //el length imprime el tamaño del arreglo
        // se va a llenar el arreglo de valores aleatorios
        for(int i = 0; i < datos.length; i++){
                        //casting -- elimina la parte decimal para que quede solo el entero
            datos[i] = (int) (Math.random() * 100);
        }
        for(int i = 0; i < datos.length; i++){
            System.out.print("[" + datos[i] + "]");
        }
    }
}
