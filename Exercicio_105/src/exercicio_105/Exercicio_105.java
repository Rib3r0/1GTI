package exercicio_105;

import java.util.Scanner;

public class Exercicio_105 {

    public static void main(String[] args) {
        String sigla;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual é a sigla?:");
        sigla = teclado.next().toUpperCase();
        
        if(sigla.equals("SP")){
            System.out.println("Paulista");
        }else if(sigla.equals("RJ")){
            System.out.println("Carioca");
        }else if(sigla.equals("MG")){
            System.out.println("Mineiro");
        }else{
            System.out.println("Outros Estados");
        }
        
    }
    
}
