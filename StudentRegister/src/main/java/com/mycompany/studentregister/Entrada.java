
package com.mycompany.studentregister;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class Entrada {

    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = br.next();
        System.out.println("Este es su nombre"+ nombre);
        
    }
    
}
