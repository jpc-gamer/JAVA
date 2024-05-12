/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite o numero desejado : ");
        int numero = sc.nextInt();
        
        sc.close();
        
        for(int i = numero - 1; i > 0; i--){
            numero = numero * i;
            System.out.println(i);
            System.out.println(numero);
        }

        System.out.println("O resultado do numero escolhido fatorado foi de : " + numero);
    }
}