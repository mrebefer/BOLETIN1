
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
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float millasMarinas = 0, conversionM = 1852, conversor = 0;
        System.out.println("Introduzca las millas marinas: ");
        millasMarinas = leer.nextFloat();
        conversor = millasMarinas * conversionM;
        System.out.println(+millasMarinas + " Millas marinas son " + conversor + " metros");
    }

}
