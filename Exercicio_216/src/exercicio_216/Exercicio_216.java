package exercicio_216;

import java.util.Scanner;

public class Exercicio_216 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int impar = 0;
        int par = 0;
        
        for(int i=1; i <= 20;i++){
            System.out.println("Qual o "+i+"º numero:");
            numero = teclado.nextInt();
            if(numero%2 == 0){
                par += 1;
            }else{
                impar += 1;
            }
        }
        
        System.out.println("Impar :"+impar);
        System.out.println("par :"+par);
        
        
    }
    
}
