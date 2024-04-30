package exercicio_630;

import java.util.Scanner;

public class Exercicio_630 {

    public static void main(String[] args) {
        //variaveis
        double valorPorHora;
        double horasTrabalhadas;
        double descontoINSS;
        double salarioBruto;
        double salarioLiquido;
        
        
        System.out.println("Exercicio 630");
        System.out.println("RA: 2090782411011");
        System.out.println("Aluno: Eduardo Ribeiro Pimenta");
        
        
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Valor da Hora trabalhada R$?:");
        
        valorPorHora = teclado.nextDouble();
        
        System.out.println("Horas trabalhadas no mes?:");
        
        horasTrabalhadas = teclado.nextDouble();
        
        System.out.println("Desconto do INSS:");
        
        descontoINSS = teclado.nextDouble();
        
        salarioBruto = valorPorHora * horasTrabalhadas;
        
        salarioLiquido = salarioBruto - (salarioBruto * descontoINSS / 100);
        
        System.out.println("Salario liquido a receber em R$:"+ salarioLiquido);
        
        
        
        
    }
    
}
