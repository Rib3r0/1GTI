package exercicio_115;

import java.util.Scanner;

public class Exercicio_115 {

    public static void main(String[] args) {
        int numero1 ;
        int numero2 ;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o primeiro numero?");
        numero1 = teclado.nextInt();
        System.out.println("Qual o segundo numero?");
        numero2 = teclado.nextInt();
        
        if(numero1 < numero2){
            System.out.println("numero 1: " + Math.pow(numero1, 2));
            if( Math.sqrt(numero2) % 1 == 0){
                System.out.println("numero 2: " + Math.sqrt(numero2));
            }else{
                System.out.println("numero 2: Não tem raiz!");
            }
        }else{
            System.out.println("numero 2: " + Math.pow(numero2, 2));
            if( Math.sqrt(numero1) % 1 == 0){
                System.out.println("numero 1: " + Math.sqrt(numero1));
            }else{
                System.out.println("numero 1: Não tem raiz!");
            }
        }
    }
    
}
