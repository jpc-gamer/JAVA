/**
 *
 * @author Arthur & JPC
 * 
 */

 import java.util.Scanner;

 public class ex05_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0;
        char decisao = 's';
        while(decisao == 's'){
            
            double prova1 = 1;
            double prova2 = 1;

            System.out.println("Digite o valor da primerira nota: ");
            prova1 = sc.nextInt();

            while(prova1 < 0 || prova1 > 10){

                System.out.println(prova1 +" não é um valor válido. Digite outro valor: ");
                prova1 = sc.nextInt();

            }

            System.out.println("Digite o valor da segunda nota: ");
            prova2 = sc.nextInt();

            while(prova2 < 0 || prova2 > 10){

                System.out.println(prova2 +" não é um valor válido. Digite outro valor: ");
                prova2 = sc.nextInt();

            }

            double media;

            media = (prova1 + prova2) / 2;

            System.out.println("O valor da média é: "+ media+"\nNovo cálculo? (s/n)");
            decisao = sc.next().charAt(0);

        }
    } 
}
