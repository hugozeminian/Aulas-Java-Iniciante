/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author hugoz
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3,6,1,10,4,2};
        Arrays.sort(vet);
        for(int v: vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        
        //Arrays.sort(vet);
        //System.out.println(vet + " ");
        int p = Arrays.binarySearch(vet, 5);
        
        System.out.println("Encontrei o valor na posição " + p);
                
    }
    
}
