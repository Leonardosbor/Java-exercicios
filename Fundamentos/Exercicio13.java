// Exercício ARRAY + SCANNER sem validações

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String[] produtos = new String[5];

        for(int i = 0; i < produtos.length; i++){
            System.out.print("Cadastre um produto: ");
            produtos[i] = entrada.nextLine();
        }

        for(int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i]);
        }

        entrada.close();

    }
}
