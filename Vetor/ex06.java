/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor insira o tamanho do vetor");
        int tamanhoVetor = entrada.nextInt();

        while (tamanhoVetor <= 0) {
            System.out.println("Tamanho indisponivel!!");   
            System.out.println("Por favor digite novamente");
            tamanhoVetor = entrada.nextInt();
        }

        int vetorA[] = new int [tamanhoVetor];
        int vetorB[] = new int [tamanhoVetor];
        int soma[] = new int [tamanhoVetor];
    
        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira o valor do vetor A para o indice: " + i);
            vetorA[i] = entrada.nextInt();
            
            System.out.println("Insira o valor do vetor B para o indice: " + i);
            vetorB[i] = entrada.nextInt();

            System.out.println("\n");
            
            soma[i] = vetorA[i] + vetorB[i];
        }

        entrada.close();

        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Valores do vetor soma : " + soma[i]);
        }
    }
}