/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_arreglo_objetos;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_14_ARREGLO_OBJETOS {

    public static void main(String[] args) {
        Persona datos[] = new Persona[5];
        datos[0] = new Persona();
        datos[0] = new Persona();
        datos[0] = new Persona();
        datos[0] = new Persona();
        datos[0] = new Persona();
        for(int i = 0; i < datos.length; i++ ){
            datos[i] = new Persona();
        }
        datos[0].setNombre("NOMBRE 1");
        datos[1].setNombre("NOMBRE 2");
        datos[2].setNombre("NOMBRE 3");
        datos[3].setNombre("NOMBRE 4");
        datos[4].setNombre("NOMBRE 5");
        for(int i = 0; i < datos.length; i++ ){
            System.out.println(datos[i].getNombre());
        }
    }
}
// cuando se usan clases normalmente estan fuera de otras clases 
class Persona{

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String nombre;
    //metodo get y set para poder usar atributos privados
}