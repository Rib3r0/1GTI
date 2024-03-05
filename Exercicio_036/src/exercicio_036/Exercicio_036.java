package exercicio_036;

import java.util.Scanner;

public class Exercicio_036 {

    public static void main(String[] args) {
        // variaveis
        int num1;
        int num2;
        int resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.print("Insira o segundo numero a ser somado: ");
        num2 = teclado.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("A soma é: "+ resultado);
    }
    
}
