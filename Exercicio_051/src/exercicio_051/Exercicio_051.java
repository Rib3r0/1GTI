package exercicio_051;

import java.util.Scanner;

public class Exercicio_051 {

    public static void main(String[] args) {
        //var
        double raio;
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o raio:");
        raio = teclado.nextDouble();
     
        System.out.println("Perimetro: "+ (2 *Math.PI * raio));
        System.out.println("Area: "+ (Math.PI * Math.pow(raio, 2)));
    }
    
}
