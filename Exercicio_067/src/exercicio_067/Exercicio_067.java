package exercicio_067;

import java.util.Scanner;

public class Exercicio_067 {

    public static void main(String[] args) {
        
        double prestacao;
        double valor;
        double tempo;
        double taxa;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o valor?");
        valor = teclado.nextDouble();
        System.out.println("Qual o tempo?(em meses)");
        tempo = teclado.nextDouble();
        System.out.println("Qual o taxa?(em porcentagem)");
        taxa = teclado.nextDouble();
        
        prestacao = valor + (valor * (taxa / 100) * tempo);
        
        System.out.println("Valor: R$"+valor);
        System.out.println("Tempo: "+tempo + " meses");
        System.out.println("Taxa: "+taxa+"%");
        System.out.println("Resposta: R$"+prestacao);
        
    }
    
}
