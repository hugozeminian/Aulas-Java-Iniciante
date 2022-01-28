/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciociorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author hugoz
 */
public class ExerciocioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       //JOptionPane.showMessageDialog(null, "Ola mundo", "boas vindas", JOptionPane.ERROR_MESSAGE);
       //JOptionPane.showMessageDialog(null, "Ola mundo", "boas vindas", JOptionPane.WARNING_MESSAGE);
       //int n = Integer.parseInt(JOptionPane.showInputDialog("informe um numero"));
       //JOptionPane.showMessageDialog(null, "Você digitou: "+n);
       
       /*
       
       int n, s = 0;
       do {
           n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero (o valor 0 interrompe)"));
           s += n;
       } while(n != 0);
       JOptionPane.showMessageDialog(null, "A soma digitada foi: "  +s);
        */
       
       
       int i, s = 0, totV = 0, totP = 0, totI = 0, acimaCem = 0, medV = 0;
       do {
           i = Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um dúmero <br>(o valor 0, interrompe a sequência)</html>"));
           if (i==0) {
               break;
           }
           s += i;
           
           // total de valores
           totV ++; 
           
           //total de impares e pares
           if (i%2 == 0) {
               totP ++;
           } else {
               totI ++;
           }
           
           //total acima de cem
           if (i>100){
               acimaCem ++;
           }
       } while(i != 0);
       
       //media valores
       medV = s / totV;
       
       //display
       JOptionPane.showMessageDialog(null, 
               "<html>Resultado: <br><hr>" +
               "<br>Total de valores: "  + totV+
               "<br>Total de Pares: "  + totP+
               "<br>Total de Impares: "  + totI+
               "<br>Acima de 100: "  + acimaCem+
               "<br>Media dos valores: "  + medV+
               "</html>", null ,JOptionPane.WARNING_MESSAGE);       
       
    }
    
}
