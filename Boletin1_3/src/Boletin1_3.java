
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//  Creamos un objeto scanner para leer de teclado
        Scanner entrada = new Scanner(System.in);
// declarar variables
        float conversor;
        float euros, dolares;
        System.out.println("Conversor de divisas de euros a dolares");
//Pedimos el conversor 
        System.out.println("Factor de conversion?");
        conversor = entrada.nextFloat();
//Pedimos los euros, si el numero es 0 o negativo vuelve a pedirlo 
        do {
            System.out.println("euros de quesea cambiar?");
            euros = entrada.nextFloat();
        } while (euros <= 0);
        dolares = conversor * euros;
        System.out.println(euros + "€ son " + dolares + "$");
    }
}
