import java.util.Scanner;

public class Ex19_SomaNotasAprovadas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5];

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite uma nota: ");
            notas[i] = entrada.nextDouble();
        }

        double somaNotasAprovadas = 0;

        for(int i = 0; i < notas.length; i++){
            if (notas[i] >= 7){
                somaNotasAprovadas += notas[i];
            }
        }

        
        System.out.println();
        System.out.println("=== RESULTADO ===");
        System.out.println("Soma das notas: " + somaNotasAprovadas);
        System.out.println();

        entrada.close();
    }
}
