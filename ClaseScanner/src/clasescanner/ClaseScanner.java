/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescanner;

import java.util.Scanner;

/**
 *
 * @author LORENA
 */
public class ClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre por teclado: ");
        Scanner ent = new Scanner(System.in);
        //Meter nombre por teclado
        String nombre = ent.nextLine();
        System.out.println("Introduzca su edad por teclado: ");
        //Meter edad por teclado
        int edad = ent.nextInt();
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
    }

}
