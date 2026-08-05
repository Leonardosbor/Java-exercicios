// Exercicio de Switch com menu bancário

import java.util.Scanner;

public class Ex7_Switch{
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = entrada.nextLine();

        System.out.println("\n--- MENU BANCÁRIO ---");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Fazer depósito");
        System.out.println("3 - Fazer saque");
        System.out.println("4 - Sair");
        
        System.out.print("Digite uma opção: ");
        int opcao = entrada.nextInt();

        System.out.println(); // linha em branco para organizar o visual do console

        switch (opcao) {
            case 1:
                System.out.println("Opção escolhida: Consultar saldo");
                break;
            
            case 2:
                System.out.println("Opção escolhida: Fazer depósito");
                break;
            
            case 3:
                System.out.println("Opção escolhida: Fazer saque");
                break;

            case 4:
                System.out.println("Saindo do sistema");
                break;
            
            default:
                System.out.println("Opção inválida.");
                break;
        
        }

        System.out.println("Nome do usuário: " + nomeUsuario);
        entrada.close();
                
        
        
    }
}