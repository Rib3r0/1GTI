package exercicio_186;

import java.util.Scanner;

public class Exercicio_186 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int numero;
        
        
        for(i=1; i<=3;i++){
            
            System.out.println("insira o "+ i +" numero:");
            numero = teclado.nextInt();
            
            System.out.println("Cubo: %s".formatted(Math.pow(numero, 3)));
            System.out.println("Raiz cubo: %.3f".formatted(Math.cbrt(numero)));
            
        }
    }
    
}
