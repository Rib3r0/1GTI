package exercicio_106;

import java.util.Scanner;

public class Exercicio_106 {

    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o nome?");
        nome = teclado.next().toUpperCase();
        
        if(nome.startsWith("A") ||
           nome.startsWith("E") || 
           nome.startsWith("I") ||
           nome.startsWith("O") ||
           nome.startsWith("U") 
           ){
            System.out.println(nome);
        }else{
            System.out.println("Não começa com vogal!");
        }
    }
    
}
