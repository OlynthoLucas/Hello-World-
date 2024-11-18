import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner num01 = new Scanner(System.in);
        System.out.println("Insira o primeiro numero para somar: ");
        int num01Value = num01.nextInt();
        Scanner num02 = new Scanner(System.in);
        System.out.println("Insira o segundo numero para somar: ");
        int num02Value = num02.nextInt();

        int soma = num01Value + num02Value;
        System.out.println("A soma dos dois numeros e: " + soma);
    }
}
