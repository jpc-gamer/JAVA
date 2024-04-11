/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */

public class While05 {
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             
      int numero;
      int x = 0; 
      int y = 0;
      while(x < 10){ 
            System.out.println("Digite o número: ");
            numero = sc.nextInt();
            
            if(numero > y){
                y = numero;
            }
                
            
     
            x++;
      }
        
        }
    
}
