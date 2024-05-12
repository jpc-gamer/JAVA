/**
 *
 * @author Arthur & JPC
 * 
 */

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        double temperatura [] = new double [5];  
        double maiorTemperatura = 0;
        double temperaturaMedia = 0;
        int infTemperaturaMedia = 0;
        Scanner entrada = new Scanner (System.in);

        //receber temperatura
        for ( int i = 0; i < temperatura.length ; i++ ){
            System.out.println("Digite a temperatura: ");
            temperatura[i] = entrada.nextDouble();
        }

        entrada.close();

        //maior temperatura
        for (int i = 1; i < temperatura.length; i++ ){
            if (temperatura[i] > temperatura[i - 1]){
                maiorTemperatura = temperatura [i];
            } else if (maiorTemperatura < temperatura [i - 1]) {
                maiorTemperatura = temperatura [i - 1];
            }
        }
        
        //utilizo a maior temperatura como limite
        double menorTemperatura = maiorTemperatura;  

        //menor temperatura
        for (int i = 1; i < temperatura.length; i++ ){
            if (menorTemperatura > temperatura[i]) {
                if (temperatura[i] < temperatura[i - 1]){
                    menorTemperatura = temperatura[i];
                }else if (temperatura[i - 1] < menorTemperatura){
                    menorTemperatura = temperatura[i - 1];
                }
            }
        }
        
        //temperatura media
        for (int i = 0; i < temperatura.length; i++){
            temperaturaMedia += temperatura[i];
        }
        temperaturaMedia = temperaturaMedia / temperatura.length;

        //O número de dias no ano em que a temperatura foi inferior a média anual
        for (int i = 0; i < temperatura.length; i++){
            if (temperaturaMedia > temperatura[i]) {
                infTemperaturaMedia ++;
            }
        }

        System.out.println("\nA temperatura media temperatura do ano foi de: " + temperaturaMedia); 
        System.out.println("O número de dias no ano em que a temperatura foi inferior a média anual foi de: " + infTemperaturaMedia);
        System.out.println("A maior temperatura do ano foi de: " + maiorTemperatura); 
        System.out.println("A menor temperatura temperatura do ano foi de: " + menorTemperatura); 
    }
}
