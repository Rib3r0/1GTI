package exercicio_116;

import java.util.Scanner;

public class Exercicio_116 {

    public static void main(String[] args) {
        int numero1 ;
        int numero2 ;
        int numero3 ;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o primeiro numero?");
        numero1 = teclado.nextInt();
        System.out.println("Qual o segundo numero?");
        numero2 = teclado.nextInt();
        System.out.println("Qual o terceiro numero?");
        numero3 = teclado.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1);
        }else if(numero2 > numero1 && numero2 > numero3){
            System.out.println(numero2);
        }else if(numero3 > numero1 && numero3 > numero2){
            System.out.println(numero3);
        }
    }
    
}
