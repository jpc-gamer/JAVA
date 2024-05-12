/**
 *
 * @author Arthur & JPC
 * 
 */

public class ex16 {
    public static void main(String[] args) {
        int termoUm = 1;
        int termoDois = 1;
        int proximoTermo = 0;

        System.out.println("Série de Fibonacci até que o numero seja maior ou igual a 500 : ");
        System.out.print(termoUm + " " + termoDois + " ");
        
        while (proximoTermo <= 500) {
            proximoTermo = termoUm + termoDois;
            System.out.print(proximoTermo + " ");
            termoUm = termoDois;
            termoDois = proximoTermo;
        }
    }
}