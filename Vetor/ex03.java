/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        
        boolean contemLista = false;
        String  nome [] = new String  [10];
        String pesquisa = "";
        Scanner entrada = new Scanner (System.in); 

        for ( int i = 0; i < nome.length ; i++ ){
            System.out.println("Digite seu nome");
            nome[i] = entrada.nextLine(); 
        }

        System.out.println("Digite o nome no qual deseja procurar");
        pesquisa = entrada.nextLine();
        entrada.close();   

        for ( int i = 0; i < nome.length ; i++ ){
            if (pesquisa.equals(nome[i])) {
                System.out.println("Você está na lista");
                contemLista = true;
                break;
            }else {
                contemLista = false;
            }
        }

        if (contemLista == false) {
            System.out.println("Você não está na listaa");
        }
    }
}
