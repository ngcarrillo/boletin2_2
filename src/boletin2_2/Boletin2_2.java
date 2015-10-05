/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float lado;
        System.out.println("Introduce un lado");
        Scanner ladoCuadrado = new Scanner(System.in);
        lado = ladoCuadrado.nextFloat();
        System.out.println("Área total cuadrado " +lado*lado);
    }
    
}
