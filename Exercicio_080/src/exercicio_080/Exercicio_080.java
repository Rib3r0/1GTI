package exercicio_080;

import java.util.Scanner;

public class Exercicio_080 {

    public static void main(String[] args) {
        double acervo;
        double faturamento;
        double custoFita;
        double multa;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o acervo da locadora?");
        acervo = teclado.nextInt();
        System.out.println("Custo do aluguel da fita?");
        custoFita = teclado.nextInt();
        
        faturamento = (acervo /3) * 10 * 12;
        multa = (acervo /3) * 0.1 ;
        
        System.out.println("Faturamento anual R$"+faturamento);
        System.out.println(multa * 1.1);
        System.out.println(acervo * 0.98 * 1.1);
        
        
    }
    
}
