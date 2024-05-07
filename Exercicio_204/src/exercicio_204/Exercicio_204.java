package exercicio_204;

import java.util.Scanner;

public class Exercicio_204 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero;
        int numero;
        int maior;
        
        
        System.out.println("Qual o 1º Numero:");
        primeiroNumero = teclado.nextInt();
        maior = primeiroNumero;
        
        for (int i = 1; i < primeiroNumero; i++ ) {
            System.out.println("Qual o "+(i+1)+"º Numero:");
            numero = teclado.nextInt();
            if(numero > maior){
                maior = numero;
            }
        }
        System.out.println(maior);
    }
    
}
