package exercicio_109;

import java.util.Scanner;


public class Exercicio_109 {

    public static void main(String[] args) {
        String nome1 ;
        String nome2 ;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o nome 1?");
        nome1 = teclado.next().toUpperCase();
        System.out.println("Qual o nome 2?");
        nome2 = teclado.next().toUpperCase();
        
        if(nome1.charAt(0) < nome2.charAt(0)){
            System.out.println(nome1);
            System.out.println(nome2);
        }else{
            System.out.println(nome2);
            System.out.println(nome1);
        }
        
        
    }
    
}
