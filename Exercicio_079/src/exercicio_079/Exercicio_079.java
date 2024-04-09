package exercicio_079;

import java.util.Scanner;

public class Exercicio_079 {

    public static void main(String[] args) {
        double valorAcumulado;
        double taxa;
        double aplicacaoMes;
        int meses;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Aplicação mensal de?");
        aplicacaoMes = teclado.nextDouble();
        System.out.println("Taxa de?");
        taxa = teclado.nextDouble()/100;
        System.out.println("Quantos meses?");
        meses = teclado.nextInt();
        
        
        valorAcumulado = aplicacaoMes * ((Math.pow(1+taxa, meses)-1)/taxa);
        
        System.out.println(valorAcumulado);
        
        
    }
    
}
