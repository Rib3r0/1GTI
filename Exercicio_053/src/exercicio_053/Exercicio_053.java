package exercicio_053;

import java.util.Scanner;

public class Exercicio_053 {

    public static void main(String[] args) {
        // var
        double largura;
        double comprimento;
        double altura;
        double diagonal;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira a largura :");
        largura = teclado.nextDouble();
        System.out.print("Insira o comprimento :");
        comprimento = teclado.nextDouble();
        System.out.print("Insira o altura:");
        altura = teclado.nextDouble();
        
        diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2) + Math.pow(altura, 2));
        
        System.out.println("");
        System.out.println("lagura:"+ largura);
        System.out.println("comprimento:"+ comprimento);
        System.out.println("altura:"+ altura);
        System.out.println("diagonal:"+ diagonal);
        
        
        
    }
    
}
