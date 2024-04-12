/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variavel;

import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class ex07 {
    
    /**/
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         double combustivel;
         double consumo;
         
         System.out.println("Digite o custo de combustìvel: ");
         combustivel = sc.nextInt();
         
          
         System.out.println("Digite a média de consumo: ");
         consumo = sc.nextInt();
         
         double media = combustivel/consumo; 
         
         System.out.println("O custo estimado é: " +media+"km/l");
         
         
         
         
         
    }
}
