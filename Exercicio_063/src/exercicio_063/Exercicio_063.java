package exercicio_063;

import java.util.Scanner;

public class Exercicio_063 {

    public static void main(String[] args) {
        // var
        double valorPorHora;
        double horasTrabalhadasNoMes;
        double descontoInss;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Valor por Hora:");
        valorPorHora = teclado.nextDouble();
        System.out.print("Horas Trabalhadas:");
        horasTrabalhadasNoMes = teclado.nextDouble();
        System.out.print("Desconto do INSS:");
        descontoInss = teclado.nextDouble();
        
        System.out.println("salario: "+ ((valorPorHora * horasTrabalhadasNoMes) - (valorPorHora * horasTrabalhadasNoMes * descontoInss/100))  );
        
    }
    
}
