package exercicio_082;

import java.util.Scanner;

public class Exercicio_082 {

    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o numero?:");
        numero = teclado.nextInt();
        
        if(numero < 20){
            System.out.println("O numero "+numero+" é menor que 20!");
        }else if(numero == 20){
            System.out.println("O numero "+numero+" é igual a 20!");
        }else{
            System.out.println("O numero "+numero+" é maior que 20!");
        }
        
    }
    
}
