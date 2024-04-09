package exercicio_101;

import java.util.Scanner;

public class Exercicio_101 {

    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o numero?:");
        numero = teclado.nextInt();
        
        if(numero >= 20 && numero <= 90){
            System.out.println("O numero está entre 20 e 90");
        }else{
            System.out.println("O numero não está entre 20 e 90");
        }
    }
    
}
