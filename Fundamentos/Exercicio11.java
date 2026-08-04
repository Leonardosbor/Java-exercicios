// Mini Sistema de Cadastro de Produtos

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Exibir produto");
            System.out.println("3 - Mostrar estoque");
            System.out.println("4 - Sair");

            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.print(" Digite o nome do produto: ");
                    String nomeProduto = entrada.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = entrada.nextDouble();
                    
                    System.out.print("Quantidade em estoque: ");
                    int estoque = entrada.nextInt();

                    
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                
                case 2:
                    System.out.println("");
                    break;
                
                case 3:
                    System.out.println("");
                    break;
                
                case 4:
                    System.out.println("");
                    break;
                
                default:
                    System.out.println("Opção inexistente");
                    break;

            }


        } while (opcao != 4);

        System.out.println("Sistema encerrado");

        entrada.close();
    }
}
