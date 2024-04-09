package exercicio_104;

import java.util.Scanner;

public class Exercicio_104 {


    public static void main(String[] args) {
        String nome, sexo;
        int idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?:");
        nome = teclado.next();
        System.out.println("Qual o sua idade?:");
        idade = teclado.nextInt();
        System.out.println("Qual o seu sexo(F,M)?:");
        sexo = teclado.next();
        
        if(idade <= 25 && (sexo.equals("F") || sexo.equals("f"))){
            System.out.println("ACEITA");
        }else{
            System.out.println("NAO ACEITA");
        }        
    }
    
}
