
package exercicio_064;

import java.util.Scanner;

public class Exercicio_064 {

    public static void main(String[] args) {
        
        double grausC;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a temperatura em graus Celsius?");
        grausC = teclado.nextDouble();
        System.out.println("Em Fahrenheit é:"+ ((9 * grausC + 160)/5) );
    }
    
}
