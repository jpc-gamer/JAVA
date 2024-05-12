/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite os numeros desejados : ");
        int quantidadeNumeros = 3;
        
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int terceiroNumero = sc.nextInt();

        int menorValor = 0;
        int maiorValor = 0;
        int somaValores = 0;
        sc.close();

        while (quantidadeNumeros != 0) {
            if (primeiroNumero > segundoNumero) {
                if (primeiroNumero > terceiroNumero) {
                    maiorValor = primeiroNumero;
                }
            } else if (segundoNumero > terceiroNumero) {
                maiorValor = segundoNumero;
            }else{
                maiorValor = terceiroNumero;
            }

            if (primeiroNumero < segundoNumero) {
                if (primeiroNumero < terceiroNumero) {
                    
                    menorValor = primeiroNumero;
                }
            } else if (segundoNumero < terceiroNumero) {
                menorValor = segundoNumero;
            }else{
                menorValor = terceiroNumero;
            }

            quantidadeNumeros --;
        }

        somaValores = primeiroNumero + segundoNumero + terceiroNumero;
        
        System.out.println("O maior numero foi : " + maiorValor);
        System.out.println("O menor numero foi : " + menorValor);
        System.out.println("A soma dos numeros foi : " + somaValores);
    }
}