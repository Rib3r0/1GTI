package exercicio_034;

import java.util.Scanner;

public class Exercicio_034 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        System.out.print("Entre um numero inteiro: ");
        num = teclado.nextInt();
        System.out.println("Numero Antecessor "+ (num-1));
        System.out.println("Numero sucessor "+ (num+1));
        
    }
    
}
