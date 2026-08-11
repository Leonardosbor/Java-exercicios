public class Ex23_MetodosCombinados {
    
    public static double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public static String verificarSituacao(double media){
        if (media >= 7){
            return "Aluno(a) aprovado(a).";

        } else if (media >= 5){
            return "Aluno(a) em recuperação.";

        } else {
            return "Aluno(a) reprovado(a).";
        }
    }

    public static void main(String[] args) {
        
        double mediaFinal = calcularMedia(9, 7);
        String situacao = verificarSituacao(mediaFinal);

        System.out.println();    
        System.out.println("Média: " + mediaFinal);
        System.out.println("Situação: " + situacao);
        System.out.println();

    }
    
}
