package exercicio_92;

import java.util.Scanner;

public class Exercicio_92 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o primeiro numero?:");
        numero1 = teclado.nextInt();
        System.out.println("Qual o segundo numero?:");
        numero2 = teclado.nextInt();
        
        resultado = numero1 + numero2;
        
        if(resultado > 20){
            resultado += 8;
            System.out.println("O resultado é"+resultado);
        }else if(resultado <= 20){
            resultado -= 5;
            System.out.println("O resultado é"+resultado);
        }
    }
    
}
