package exercicio_191;

import java.util.Scanner;

public class Exercicio_191 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limiteSuperior;
        int incremento;
        
        System.out.println("Qual o limite:");
        limiteSuperior = teclado.nextInt();
        
        System.out.println("Qual o Incremento:");
        incremento = teclado.nextInt();
        
        System.out.println("Saida:");

        for (int i = incremento; i <= limiteSuperior; i+=incremento ) {
            
            System.out.print(i+" ");
            
        }
        
        
        
    }
    
}
