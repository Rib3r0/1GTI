package exercicio_035;

import java.util.Scanner;

public class Exercicio_035 {

    public static void main(String[] args) {
         // variaveis
        String nome;
        String endereco;
        String telefone;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Insira seu endereco: ");
        endereco = teclado.nextLine();
        System.out.print("Insira seu telefone: ");
        telefone = teclado.nextLine();
        
        // saida de dados
        
        
        System.out.println("Nome: "+ nome);
        System.out.println("Endereco: "+ endereco);
        System.out.println("Telefone: "+ telefone);
    }
    
}
