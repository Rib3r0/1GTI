package exercicio_215;

import java.util.Scanner;

public class Exercicio_215 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Qual o numero:");
        numero = teclado.nextInt();
        
        System.out.println("Divisores:");
        for(int i=1; numero/i >= 1; i++){

            if( numero%i == 0 ){
                System.out.println(i);
            }
            
        }
    }
    
}
