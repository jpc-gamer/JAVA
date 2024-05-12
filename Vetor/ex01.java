/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){
        
        int num [] = new int [10]; 
        Scanner entrada = new Scanner (System.in); 

        for ( int i = 0; i < num.length ; i++ ){
            System.out.println("Digite um número");
            num[i] = entrada.nextInt(); 
        }

        entrada.close();

        for (int i = num.length - 1; i < num.length; i--){
            System.out.println("A ordem inversa é: " + num[i]);
            if (i == 0) {
                break;
            }
        }
    }
}
