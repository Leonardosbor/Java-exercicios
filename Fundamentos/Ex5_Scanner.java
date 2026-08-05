import java.util.Scanner;

public class Ex5_Scanner {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Digite seu salário: ");
        double salario = entrada.nextDouble();

        entrada.nextLine(); //importante para chamar cidade
        
        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();

        boolean possuiMaiorIdade = idade >= 18;

        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$" + salario);
        System.out.println("Cidade: " + cidade);
        System.out.println("Maior de idade: " + possuiMaiorIdade);

        entrada.close();

    }
}
