package exercicio_212;

import java.util.Scanner;

public class Exercicio_212 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int soma = 0;
        
        for(int i=1; i <= 20;i++){
            System.out.println("Qual o "+i+"º numero:");
            numero = teclado.nextInt();
            if(Math.pow(numero, 2) < 225){
                soma += numero;
            }
        }
        
        System.out.println("Soma é de :"+soma);
        
        
        
    }
    
}
