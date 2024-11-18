import java.util.Scanner;



public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vamos calcular a media do aluno! Qual o nome do aluno?");
        
        String nome = scanner.nextLine();

        System.out.println("Agora digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Agora digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Agora digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("A média do " + nome + " é: " + (nota1 + nota2 + nota3) / 3);
    }
}
