package exercicio_196;

import java.util.Scanner;

public class Exercicio_196 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int produto = 0;
        
        
        System.out.println("Qual o Numero:");
        num = teclado.nextInt();
        
        System.out.println("Saida:");

        for (int i = 1; i < num; i++ ) {
            
            
            if( i%5 == 0){
                produto += i;
            }
            
        }
        System.out.println(produto);
    }
    
}
