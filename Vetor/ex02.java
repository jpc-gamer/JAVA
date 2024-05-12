/**
 *
 * @author Arthur & JPC
 * 
 */

public class ex02 {
    public static void main(String[] args){
        
        int num [] = new int [50]; 

        System.out.println("Numeros crescente");

        for (int i = 0; i < num.length ; i++ ){
            num[i] = i;
            System.out.println(num[i]);
        }

        System.out.println("Numeros decrescente");

        for (int i = num.length - 1; i < num.length; i--){
            System.out.println(num[i]);
            if (i == 0) {
                break;
            }
        }
    }
}
