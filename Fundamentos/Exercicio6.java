// Exercício de condicionais IF, ELIF, ELSE

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        String resultado;

        if (media >= 7){
            resultado = "Aprovado";

        } else if (media >= 5){
            resultado = "Recuperação";

        } else {
            resultado = "Reprovado";
        }


        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + resultado);


        entrada.close();

    }
}
