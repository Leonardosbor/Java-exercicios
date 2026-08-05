// Exercício de ARRAY + FOR + ACUMULADOR

import java.util.Scanner;

public class Ex14_ArrayMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.print(" Digite uma nota: ");
            notas[i] = entrada.nextDouble();
        }

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.print("Média: " + media); 

        entrada.close();

    }
}
