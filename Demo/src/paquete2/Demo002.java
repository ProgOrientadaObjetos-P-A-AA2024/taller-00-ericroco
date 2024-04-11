/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Mensaje;
import paquete3.Informacion;
import java.util.*;

/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        /* Despúes de importar las clases llamamos las funciones que deseabamos 
        imprimir para de esa manera darles uso en el printf en la frase
         */
        int opcion;
        String presentar = String.format("%s con %d\n",
                 Mensaje.obtenerMensaje(),
                Informacion.obtenerHabitantes());

        System.out.println("Ingrese un valor entre 1 a 5 para presentar "
                + "la cadena original o ingrese cualquier otro valor "
                + "para presentarla en mayusculas");
        opcion = entrada.nextInt();

        if (opcion >= 1 && opcion <= 5) {
            System.out.printf("%s\n",presentar);
        } else {
            System.out.printf("%s\n",presentar.toUpperCase());
        }

    }

}
