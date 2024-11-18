import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular o salário do mês do funcionário!");

        
        System.out.println("Qual o nome do funcionário?");

        String nome = scanner.nextLine();

        System.out.println("Digite o salário atual do " + nome);

        
        double salario = scanner.nextDouble();

        System.out.println("Digite o percentual de comissão: ");
        
        int comissao = scanner.nextInt();

        System.out.println("Qual o valor total das vendas do mês do " + nome + "?");
        
        double vendas = scanner.nextDouble();

        double salarioComissao = salario + (vendas * comissao / 100);

        System.out.println("O salário do mês do " + nome + " é: " + salarioComissao);
        
        /*if (resposta.equals("Sim")){
            System.out.println("Qual o percentual de comissão do " + nome + "?");
        } else if(resposta.equals("Nao")) {
            System.out.println("Digite o salário correto atual:");
        } else{
            System.out.println("O salário do " + nome + " desse mês" + " é " + salario);
        };*/
        
        

        scanner.close();
    }
}