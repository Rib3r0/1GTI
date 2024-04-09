
package exercicio_066;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_066 {

    public static void main(String[] args) {
        double distancia;
        double litrosUsados;
        double tempoGasto;
        double velocidadeMedia;
        
        
        Scanner teclado = new Scanner(System.in);     
        
        System.out.println("Qual foi o tempo gasto na viagem?");
        tempoGasto = teclado.nextDouble();
        System.out.println("Qual foi a velocidade media?");
        velocidadeMedia = teclado.nextDouble();
        
        distancia = tempoGasto * velocidadeMedia;
        litrosUsados = distancia/12;
        
        System.out.println("Velocidade Media: "+velocidadeMedia +"km/h");
        System.out.println("Tempo gasto: "+tempoGasto+"hrs");
        System.out.println("distancia: "+distancia+"Km");
        System.out.println("litros utilizados: "+ new DecimalFormat("#.##").format(litrosUsados)+"L");
        
    }
    
}
