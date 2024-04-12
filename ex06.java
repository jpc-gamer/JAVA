/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variavel;

/**
 *
 * @author Aluno CA
 */
public class ex06 {
    public static void main(String[] args){
        
     int varA, varB, varC;
            
            varA = 10;
            varB = 15;
            
            System.out.println("Os numeros escolhidos são: "+ varA + " , " + varB);
            
            varC = varA;
                    
            varA = varB;
            varB = varC;
            
            System.out.println("Os numeros invertidos são: "+ varA + " ," + varB);
    }   
}
