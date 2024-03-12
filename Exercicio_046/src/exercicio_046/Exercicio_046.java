package exercicio_046;

import java.util.Scanner;

public class Exercicio_046 {

    public static void main(String[] args) {
        //var
        double saldo;
        double nSaldo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("insira o saldo:");
        saldo = teclado.nextDouble();
        
        nSaldo = saldo + saldo * 1/100;
        
        System.out.println("saldo R$:"+saldo);
        System.out.println("Novo saldo R$:"+ nSaldo);
    }
    
}
