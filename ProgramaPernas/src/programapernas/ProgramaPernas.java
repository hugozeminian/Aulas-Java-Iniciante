/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author hugoz
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int pernas;
        String tipo;
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite a quantidade de pernas você tem:");
        pernas = teclado.nextInt();
        
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;    
        }
        System.out.println(tipo);
            
        
        
        
        
    }
    
}
