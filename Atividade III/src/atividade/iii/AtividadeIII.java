/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.iii;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class AtividadeIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float salario, vendas, com, total;
        String nome;
        
          System.out.println("Digite seu nome: "); 
          nome = sc.next();
          
          System.out.println("Digite seu salário fixo R$: "); 
          salario = sc.nextInt();
          
          System.out.println("Digite o total de vendas efetuadas: "); 
          vendas = sc.nextInt();
          
          com = (float) (vendas/100) * 15 ;
  
          total = com + salario;
          
          System.out.println(
                "Seu nome é: " + nome + "\n" +
                "Seu salário fixo é = " + salario + "\n" +
                "Salário ao final do mês = " + total); 
    }
    
}
