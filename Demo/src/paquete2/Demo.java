/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Despúes de importar las clases llamamos las funciones que deseabamos 
        imprimir para de esa manera darles uso en el printf en la frase
        */
        System.out.printf("%s con %d\n", Mensaje.obtenerMensaje(),
                 Informacion.obtenerHabitantes());

    }

}
