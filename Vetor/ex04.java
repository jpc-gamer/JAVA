/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        int nota [] = new int [3]; 
        int contagem = 0; 
        int soma = 0; 
        int media = 0;
        
        Scanner entrada = new Scanner (System.in); 
        
        for ( int i = 0; i < nota.length ; i++ ){
          System.out.println("Digite a nota");
          nota[i] = entrada.nextInt(); 
          soma += nota[i]; 
          media = soma/nota.length;  
        }

        entrada.close();

        for (int i = 0; i<nota.length; i++){
          if(nota[i]> media){
            contagem ++;
          }
        }
        
        System.out.println("A soma das notas: " + soma); 
        System.out.println("A media das notas: " + media); 
        System.out.println("Alunos acima da média: " + contagem); 
  }
}
