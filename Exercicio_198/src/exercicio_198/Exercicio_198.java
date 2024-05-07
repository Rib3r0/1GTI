package exercicio_198;

import java.util.Scanner;

public class Exercicio_198 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limiteSuperior;
        int inicial;
        
        
        System.out.println("Qual o Limite:");
        limiteSuperior = teclado.nextInt();
        
        System.out.println("Qual o Valor inicial:");
        inicial = teclado.nextInt();
        
        System.out.println("Saida:");

        for (int i = inicial + 1; i < limiteSuperior; i++ ) {
            
            System.out.print(i+" ");
            
            
        }
       
    }
    
}
