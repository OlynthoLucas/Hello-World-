import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular a média de consumo do veículo!");
        
        System.out.println("Qual foi a distância percorrida? ");
        
        Scanner valor01 = new Scanner(System.in);
        
        double distancia = valor01.nextDouble();

        System.out.println("Agora digite o quantos litros foram necessários para percorrer essa distância:");

        Scanner valor02 = new Scanner(System.in);

        double litros = valor02.nextDouble();

        double media = distancia / litros;

        double media02 =  (1 / media) * 100;

        System.out.println("A média foi de:" + media);
        System.out.println(" ou" + media02 );

        System.out.println();


    }
    
}
