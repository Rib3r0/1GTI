package exercicio_041;

import java.util.Scanner;

public class Exercicio_041 {

    public static void main(String[] args) {
        //var
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Primeiro Numero:");
        n1 = teclado.nextDouble();
        System.out.println("Segundo Numero:");
        n2 = teclado.nextDouble();
        System.out.println("Terceiro Numero:");
        n3 = teclado.nextDouble();
        System.out.println("quarto Numero:");
        n4 = teclado.nextDouble();
        
        media = ((n1*1) + (n2*2) + (n3*3) + (n4*4)) /10;
        
        System.out.println("a media das notas é "+ media);
        
    }
    
}
