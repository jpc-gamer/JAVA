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
public class ex12 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int valor;
         
         System.out.println("Digite um valor: ");
         valor = sc.nextInt();
         
         int ante = valor - 1;
         
         System.out.println("O antecessor desse número é: "+ante);
         
    }
}
