package exercicio_086;

import java.util.Scanner;

public class Exercicio_086 {

    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o numero?:");
        numero = teclado.nextInt();
        
        if(numero > 0){
            System.out.println("É positivo");
        }else if(numero == 0){
            System.out.println("É zero");
        }else{
            System.out.println("É negativo");
        }
        
        
    }
    
}
