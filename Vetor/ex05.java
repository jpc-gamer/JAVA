/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        int num [] = new int [10]; 
        int numB [] = new int[10];
        Scanner entrada = new Scanner (System.in); 
    
        for ( int i = 0; i < num.length ; i++ ){
            System.out.println("Digite os números da matriz A");
            num[i] = entrada.nextInt();
            
            if (num[i] % 2 == 0) {
                num[i] = num[i] * 5;
                numB[i] = num[i];
            }else {
                    num[i] = num[i] + 5;
                    numB[i] = num[i];
                }
        }

            entrada.close();
            
        for(int i = 0; i < num.length ; i++) {
            System.out.println("Numeros da matriz A no indice " + i + ": " +  + num[i]);
            System.out.println("Numeros da matriz B no indice " + i + ": " +  + numB[i]);
        }
    }
}