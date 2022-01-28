/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamediajava;

import java.util.Scanner;

/**
 *
 * @author hugoz
 */
public class ProgramaMediaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        /*
        //CONDIÇÃO SIMPLES
        float n1, n2, m;
        
        System.out.println("Digite a primeira nota");
        n1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota");
        n2 = scanner.nextFloat();
        m = (n1 + n2) / 2;
        
        System.out.println("Sua média foi: " + m);
        
        if (m > 9) {
            System.out.println("Parabens");
        }
        */
        
        //CONDIÇÃO COMPOSTA
        int nasc, i;
             
        System.out.println("Digite seu nascimento: ");
        nasc = scanner.nextInt();
        
        i = 2021 - nasc;
        if (nasc >= 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }
}
