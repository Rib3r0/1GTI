package exercicio_184;

import java.util.Scanner;

public class Exercicio_184 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int numero;
        
        
        for(i=1; i<=5;i++){
            
            System.out.println("insira o "+ i +" numero:");
            numero = teclado.nextInt();
            
            System.out.println(Math.log10(numero));
            
            
        }
       
    }
    
}
