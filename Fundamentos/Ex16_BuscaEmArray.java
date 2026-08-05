// Exercício de busca em ARRAY

import java.util.Scanner;

public class Ex16_BuscaEmArray {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean encontrado = false;
        String produtoPesquisado;

        String[] produtos = new String[5];

        // add itens em produtos
        for(int i = 0; i < produtos.length; i++){
            System.out.print("Insira um produto: ");
            produtos[i] = entrada.nextLine();
        }

        System.out.print("Digite o nome de um produto: ");
        produtoPesquisado = entrada.nextLine();

        for(int i = 0; i < produtos.length; i++){
            if (produtos[i].equals(produtoPesquisado)){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto não encontrado!");
        }

        entrada.close();
    }
}
