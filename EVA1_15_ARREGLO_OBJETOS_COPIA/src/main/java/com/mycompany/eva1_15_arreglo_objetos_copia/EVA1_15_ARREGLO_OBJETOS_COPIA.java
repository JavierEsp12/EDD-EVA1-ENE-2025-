/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_arreglo_objetos_copia;

/**
 *
 * @author Javier Alonso Espinoza Palafox
 */
public class EVA1_15_ARREGLO_OBJETOS_COPIA {

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
            System.out.print(datos[i].getNombre());
            System.out.print("  " + datos[i] + "\n");
        }
      
        //copia
        Persona copia[] = new Persona[5];
        for(int i = 0; i < datos.length; i++){
            copia[i] = new Persona(datos[i]); //Crea un nuevo arreglo de Persona llamado copia
        }
        System.out.println("");
        for(int i = 0; i < copia.length; i++){
            System.out.print(copia[i].getNombre());
            System.out.print("  " + copia[i] + "\n");
        }
    }
}
// cuando se usan clases normalmente estan fuera de otras clases 
class Persona{

    public String getNombre() {
        return nombre;
    }
    
    public Persona() {  //Declara un atributo privado nombre de tipo String.
        // Constructor por defecto
    }

    // Constructor de copia  Define el constructor por defecto de la clase Persona.
    public Persona(Persona original) {
        this.nombre = original.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String nombre;
}
