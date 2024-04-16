package exercicio_107;

import java.util.Scanner;

public class Exercicio_107 {

    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o nome?");
        nome = teclado.next().toUpperCase();
        
        if(nome.equals("AMANDA") ||
           nome.equals("DORIVAL") 
           ){
            System.out.println(nome);
        }else{
            System.out.println("Não Altorizado!");
        }
    }
    
}
