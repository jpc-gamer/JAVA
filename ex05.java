/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variavel;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class ex05 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int lado1;
         int lado2; 
         
          System.out.println("Digite a largura: ");
            lado1 = sc.nextInt();
          
           System.out.println("Digite a altura: ");
            lado2 = sc.nextInt();
            
           int area = lado1 * lado2;
           
           System.out.println("A área do retângulo é : " +area );
                   
               
            
            
         
     }
    
}
