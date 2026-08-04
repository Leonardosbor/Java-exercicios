// Mini Sistema de Cadastro de Produtos

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomeProduto;
        double precoProduto;
        int estoque;
        boolean produtoCadastrado = false;
        int opcao;

        do{
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Exibir produto");
            System.out.println("3 - Mostrar estoque");
            System.out.println("4 - Sair");

            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();

            entrada.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    nomeProduto = entrada.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    precoProduto = entrada.nextDouble();
                    
                    System.out.print("Quantidade em estoque: ");
                    estoque = entrada.nextInt();

                    produtoCadastrado = true;
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                
                case 2:
                    if (!produtoCadastrado){
                        System.out.println("Nenhum produto cadastrado!");
                    } else{
                        System.out.println();
                        System.out.println("=== PRODUTO ===");
                        System.out.println("Nome do produto: " + nomeProduto);
                        System.out.println("Preço: " + precoProduto);
                        System.out.println("Estoque: " + estoque);
                        System.out.println("Valor Total: R$" + (precoProduto * estoque));
                    }
                    break;
                
                case 3:
                    if(!produtoCadastrado){
                        System.out.println("Nenhum produto cadastrado!");
                    } else{
                        System.out.println("=== ESTOQUE ===");
                        for(int contador = 1; contador <= estoque; contador++ ){
                            System.out.print("*");
                        }
                    }
                    break;
                
                case 4:
                    System.out.println("Saindo...");
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
