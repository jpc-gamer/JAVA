/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex01_04 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        double valor1;
        double valor2;
        
        System.out.println("Digite o primeiro número: ");
        valor1 = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        valor2 = sc.nextInt();
        
        while(valor2 == 0){
            System.out.println("0 não é um valor válido. Digite outro número: ");
            valor2 = sc.nextInt();
        }
        
        double divisao;
        
        divisao = valor1/valor2;
        
        System.out.println("O resultado da divisão é: "+divisao);

     }
}
