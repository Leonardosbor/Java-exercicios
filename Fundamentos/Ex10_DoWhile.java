// Exercício de DO-WHILE + SWITCH + FOR

import java.util.Scanner;

public class Ex10_DoWhile {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("1 - Mostrar mensagem");
            System.out.println("2 - Mostrar números");
            System.out.println("3 - Sair");

            System.out.print("Escolha: ");
            opcao = entrada.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Olá, esta é uma mensagem do sistema");
                    break;
                case 2:
                    for(int contador = 1; contador <= 5 ; contador ++){
                        System.out.println(contador);
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inexistente");
                    break;
            }


        } while (opcao != 3);

        System.out.println("Programa encerrado");

        entrada.close();

    }
}
