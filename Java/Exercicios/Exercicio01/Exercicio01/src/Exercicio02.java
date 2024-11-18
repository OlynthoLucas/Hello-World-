import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception { 
        Scanner num1 = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        
        int num01Value = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Insira o segundo numero: ");
        int num02Value = num2.nextInt();
        
        int soma = num01Value + num02Value;
        System.out.println("A soma dos dois numeros e: " + soma);

        int subtracao = num01Value - num02Value;
        System.out.println("A subtracao dos dois numeros e: " + subtracao);

        int multiplicacao = num01Value * num02Value;
        System.out.println("A multiplicacao dos dois numeros e: " + multiplicacao);

        int divisao = num01Value / num02Value;
        System.out.println("A divisao dos dois numeros e: " + divisao);
    



    
    
    
    
    }
}
