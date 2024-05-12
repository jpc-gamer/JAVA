/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite os numeros desejados : ");
        int numero = sc.nextInt();
        
        while (numero <= 0 || numero >= 1000) {
            System.out.println("Numero invalido.. Por favor digite novamente : ");
            numero = sc.nextInt();
        }
        sc.close();
    }
}