package exercicio_071;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_071 {

    public static void main(String[] args) {
        double horas;
        double minutos;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantas horas?");
        horas = teclado.nextDouble();
        
        minutos = horas * 60;
        System.out.println(new DecimalFormat("#").format(horas)+  "horas é igual a "+new DecimalFormat("#").format(minutos)+"minutos");
        
    }
    
}
