// Exercício de ARRAY para contar aprovados

import java.util.Scanner;

public class Ex18_ContarAprovados {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5];

        for(int i =0; i < notas.length; i++){
            System.out.print("Digite uma nota: ");
            notas[i] = entrada.nextDouble();
        }

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;
        

        for(int i = 0; i < notas.length; i++){
            if (notas[i] >= 7){
                aprovados++;
            } else if (notas[i] >= 5) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println();
        System.out.println("=== RESULTADO ===");
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos em recuperação: " + recuperacao);
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.println();

        entrada.close();
        
    }
}
