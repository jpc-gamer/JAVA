/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.i;

/**
 *
 * @author Aluno CA
 */

import java.util.Scanner;

public class AtividadeI {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int numeroUm, numeroDois, soma, mult, divi, sub;
       
            System.out.println("Informe o número 1: "); 
            numeroUm = sc.nextInt();
            System.out.println("Informe o número 2: ");
            numeroDois = sc.nextInt();
            
            soma = numeroUm + numeroDois;
            sub = numeroUm - numeroDois;
            mult = numeroUm * numeroDois;
            divi = numeroUm / numeroDois;
                    
            System.out.println("A soma desses numeros é igual " + soma);
            System.out.println("A subtração desses numeros é igual " + sub);
            System.out.println("A multiplicação desses numeros é igual " + mult);
            System.out.println("A divisão desses numeros é igual " + divi);
    }
    
}
