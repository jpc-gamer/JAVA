/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.Scanner;

/**
 * Comentário para criação de classe
 * @author Aluno CA
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //atividade 1
         int numeroUm, numeroDois, resultado;
       
        
            System.out.println("Informe o número 1: "); 
            numeroUm = sc.nextInt();
            System.out.println("Informe o número 2: ");
            numeroDois = sc.nextInt();
            
            resultado = numeroUm + numeroDois;
            
            System.out.println("Os números escolhidos são: " + numeroUm + " , " + numeroDois);
            System.out.println("A soma desses numeros é igual " + resultado + "\n");
            
            
            //atividade 2
            
            int varA, varB, varC;
            
            varA = 10;
            varB = 15;
            
            System.out.println("Os numeros escolhidos são: "+ varA + " , " + varB);
            
            varC = varA;
                    
            varA = varB;
            varB = varC;
            
            System.out.println("Os numeros invertidos são: "+ varA + " ," + varB);
                }
    
}
