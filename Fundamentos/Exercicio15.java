// Exercício com ARRAYS + CONDICIONAIS + CONTADORES

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [] notas = new double[3];

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.print(" Digite a nota: ");
            notas[i] = entrada.nextDouble();

            if(notas[i] >= 7){
                aprovados++;
            } else if (notas[i] >= 5){
                recuperacao++;
            } else{
                reprovados++;
            }
        }

        
        System.out.println("=== RELATÓRIO ===");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        
        entrada.close();
        
    }
}
