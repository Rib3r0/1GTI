package exercicio_84;

import java.util.Scanner;

public class Exercicio_84 {

    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o numero?:");
        numero = teclado.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }
    
}
