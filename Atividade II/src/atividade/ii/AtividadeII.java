/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.ii;

/**
 *
 * @author Aluno CA
 */

import java.util.Scanner;

public class AtividadeII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distanciaP,combustivel, media;
       
            System.out.println("Qual a distância total percorrida pelo automóvel em km: "); 
            distanciaP = sc.nextInt();
            System.out.println("Qual o total de combustível gasto em litros? ");
            combustivel = sc.nextInt();
            
            media = combustivel/distanciaP;
            
            System.out.println("A média de consumo desse automóvel é: " + media);
    }
}
