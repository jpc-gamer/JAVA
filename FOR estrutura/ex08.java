/**
 *
 * @author Arthur & JPC
 * 
 */

 public class ex08 {
    public static void main(String[] args) {
        
        int num = 10;
       
        for( int i = 10; i >= num; i --){

            if(i < 0){
                break;
            }
            
            num = num - i;
            
            System.out.println("Numeros em ordem decrescente " + i);
            
            
        }
            
    }
}