/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex13 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int num;
         
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        
        while(num <= 0 || num > 10){
            System.out.println("Numero invalido virgula digite novamente");
            num = sc.nextInt();

        }
        
       for(int i=0; i<=10; i++ ){
             System.out.println("Tabuada " +num*i);    
         }
         
     }
}
