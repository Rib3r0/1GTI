package exercicio_033;

import java.util.Scanner;

public class Exercicio_033 {

    public static void main(String[] args) {
        //vars
        int num1;
        int num2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("inserir o primeiro numero inteiro: ");
        num1 = teclado.nextInt();
                
        System.out.print("inserir o segundo numero inteiro: ");
        num2 = teclado.nextInt();
        
        System.out.println("O primeiro numero é: "+ num1);
        System.out.println("O segundo numero é: "+ num2);
        
    }
    
}
