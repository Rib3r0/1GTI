package exercicio_217;

import java.util.Scanner;

public class Exercicio_217 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        for(int i = 1; i <= 8;i++){
            System.out.println("Qual o "+i+" nome:");
            nome = teclado.next();
            
            System.out.println("O nome tem "+nome.length()+" letras");
            
            
        }
        
        
    }
    
}
