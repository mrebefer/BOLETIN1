/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float num1 = 0, num2 = 0;
        System.out.println("Introduzca el numero 1: ");
        num1 = leer.nextFloat();
        System.out.println("Introduzca el numero 2: ");
        num2 = leer.nextFloat();
        float suma = num1 + num2;
        float restar = num1 - num2;
        float multiplicar = num1 * num2;
        float division = num1 / num2;
        System.out.println(suma);
        System.out.println(restar);
        System.out.println(multiplicar);
        System.out.println(division);
    }

}
