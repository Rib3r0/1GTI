package exercicio_050;

import java.util.Scanner;

public class Exercicio_050 {

    public static void main(String[] args) {
        //var
        double base;
        double altura;
        
        double perimetro;
        double area;
        double diagonal;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("insira a base:");
        base = teclado.nextDouble();
        
        System.out.print("insira a altura:");
        altura = teclado.nextDouble();
        
        System.out.println("base: "+ base);
        System.out.println("altura: "+ altura);
        
        System.out.println("perimetro: " + altura*2 + base*2);
        System.out.println("area: " + altura * base);
        System.out.println("diagonal: " + (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))));
        
        
    }
    
}
