package exercicio_190;

import java.util.Scanner;

public class Exercicio_190 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        char sexo;
         
        int i;
        for(i=1;i<= 20; i++){
            System.out.println("Pessoa"+i);
            System.out.println("Nome:");
            nome = teclado.next();
            System.out.println("Idade:");
            idade = teclado.nextInt();
            System.out.println("Sexo(M/F/O):");
            sexo = teclado.next().toUpperCase().charAt(0);
            
            if(sexo == 'F' && idade > 21){
                System.out.println(nome);
            }
            
        }
        
        
    }
    
}
