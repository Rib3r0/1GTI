package exercicio_206;

import java.util.Scanner;

public class Exercicio_206 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vezes;
        int numero;
        int maior = 0;
        int menor = 0;
        
        
        System.out.println("Quantos numeros:");
        vezes = teclado.nextInt();
        
        for (int i = 1; i <= vezes; i++ ) {
            System.out.println("Qual o "+(i)+"º Numero:");
            numero = teclado.nextInt();
            
            if(numero > maior || i == 1){
                maior = numero;
            }
            if(numero < menor || i == 1){
                menor = numero;
            }
        }

        System.out.println("Menor:"+menor);
        System.out.println("Maior:"+maior);
    }
    
}
