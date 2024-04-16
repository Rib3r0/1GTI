package exercicio_118;

import java.util.Scanner;

public class Exercicio_118 {

    public static void main(String[] args) {
        int numero1 ;
        int numero2 ;
        int numero3 ;
        int troca;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o primeiro numero?");
        numero1 = teclado.nextInt();
        System.out.println("Qual o segundo numero?");
        numero2 = teclado.nextInt();
        if(numero2 < numero1){
            troca = numero1;
            numero1 = numero2;
            numero2 = troca;
        }
        System.out.println("Qual o terceiro numero?");
        numero3 = teclado.nextInt();
        if(numero3 < numero2){
            troca = numero2;
            numero2 = numero3;
            numero3 = troca;
        }
        if(numero2 < numero1){
            troca = numero1;
            numero1 = numero2;
            numero2 = troca;
        }
        
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        
        
        
        
    }
    
}
