package exercicio_194;

import java.util.Scanner;

public class Exercicio_194 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int produto = 1;
        
        
        System.out.println("Qual o Numero:");
        numero = teclado.nextInt();
        
        System.out.println("Saida:");

        for (int i = 1; i <= numero; i++ ) {
            
            System.out.print(i+" ");
            produto *= i;
        }
        System.out.println(produto);
    }
    
}
