// Exercício para descobrir a maior e menor nota com ARRAY + FOR

import java.util.Scanner;

public class Ex17_MaiorEMenorNota {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5];

        for(int i = 0; i < notas.length; i++){
            System.out.print("Insira uma nota: ");
            notas[i] = entrada.nextDouble();
        }

        double maiorNota = notas[0];
        double menorNota = notas[0];

        for(int i = 1; i < notas.length; i++){
            if (notas[i] > maiorNota){
                maiorNota = notas[i];
            }

            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
        }

        System.out.println();
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

        entrada.close();
    }
}
