/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author hugoz
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        int numero = 5;
        System.out.println(numero);
        numero ++;
        System.out.println(numero); 
        numero --;
        System.out.println(numero);
 
        int x = 4;
        x *=2;
        System.out.println(x);
        
        float v = 8.3f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        ar = (int) Math.ceil(v);
        System.out.println(ar);
        ar = (int) Math.round(v);
        System.out.println(ar);  
        
        double aleatorio = Math.random();
        System.out.println(aleatorio);
        
        aleatorio = 50 + Math.random() * (100 - 50);
        System.out.println(aleatorio);
        
        
        
    }
    
}
