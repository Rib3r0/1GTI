package exercicio_120;

import java.util.Scanner;

public class Exercicio_120 {

    public static void main(String[] args) {
        int menor ;
        int intermediario ;
        int maior ;
        int troca;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qual o primeiro numero?");
        menor = teclado.nextInt();
        System.out.println("Qual o segundo numero?");
        intermediario = teclado.nextInt();
        if(intermediario < menor){
            troca = menor;
            menor = intermediario;
            intermediario = troca;
        }
        System.out.println("Qual o terceiro numero?");
        maior = teclado.nextInt();
        if(maior < intermediario){
            troca = intermediario;
            intermediario = maior;
            maior = troca;
        }
        if(intermediario < menor){
            troca = menor;
            menor = intermediario;
            intermediario = troca;
        }
        
        System.out.println("menor: "+menor);
        System.out.println("Intermediario: " +intermediario);
        System.out.println("maior: " +maior);
    }
    
}
