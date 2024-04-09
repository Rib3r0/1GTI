package exercicio_096;

import java.util.Scanner;

public class Exercicio_096 {

    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o numero?:");
        numero = teclado.nextInt();
        
        if(numero  % 3 == 0 && numero % 7 == 0){
            System.out.println("É divisivel por 7 e 3");
        }else{
            System.out.println("Não é divisivel por 7 e 3 simuntaneamente!");
        }
    }
    
}
