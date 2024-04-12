/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variavel;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;

public class Variavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double n1;
         double n2; 
         
         
          System.out.println("Digite o número: ");
            n1 = sc.nextInt();
            
          System.out.println("Digite o número: ");
           n2 = sc.nextInt();
           
          double soma = n1 + n2;
          double sub = n1 - n2;
          double div = n1/n2;
          double mult = n1*n2;
          
          System.out.println("A soma = " + soma + "\n" + "A subtração = " + sub + "\n" + "A divisão é = " + div + "\n" + "A multipliacação = " + mult);
          
          
           
          
            
        
    }
    
}
