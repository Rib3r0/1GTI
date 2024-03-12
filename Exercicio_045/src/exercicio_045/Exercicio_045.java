package exercicio_045;

import java.util.Scanner;

public class Exercicio_045 {

    public static void main(String[] args) {
        //var
        int n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira um numero:");
        n = teclado.nextInt();
        
        System.out.println("numero: "+n);
        System.out.println("quadrado: "+Math.pow(n, 2));
        System.out.println("raiz: "+Math.sqrt(n));
        
    }
    
}
