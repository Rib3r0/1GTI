package exercicio_069;

import java.util.Scanner;

public class Exercicio_069 {

    public static void main(String[] args) {
        int numerador;
        int denominador;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o numerador?");
        numerador = teclado.nextInt();
        
        System.out.println("Qual o denominador?");
        denominador = teclado.nextInt();
        
        System.out.println("Resultado:"+ numerador/denominador);
        
    }
    
}
