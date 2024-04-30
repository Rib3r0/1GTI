package exercicio_1160;

import java.util.Scanner;

public class Exercicio_1160 {

    public static void main(String[] args) {
        //variaveis
        double n1;
        double n2;
        double n3;
        
        double menor;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Exercicio 1160");
        System.out.println("RA: 2090782411011");
        System.out.println("Aluno: Eduardo Ribeiro Pimenta");
        
        System.out.println("Entre o numero 1");
        n1 = teclado.nextDouble();
        
        System.out.println("Entre o numero 2");
        n2 = teclado.nextDouble();
        
        if( n1 < n2){
        
            menor = n1;
        
        }else{
            
            menor = n2;
            
        }
        
        System.out.println("Entre o numero 3");
        n3 = teclado.nextDouble();
        
        if( n3 < menor){
        
            menor = n3;
        
        }
        
        System.out.println("Menor numero:"+menor);
        
        
        
       
        
        
        
        
    }
    
}
