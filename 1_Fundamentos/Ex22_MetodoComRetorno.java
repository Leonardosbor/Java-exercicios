public class Ex22_MetodoComRetorno{

    public static double calcularMedia(double nota1, double nota2){

        return (nota1 + nota2) / 2;
    }
    public static void main(String[] args) {
    
        double mediaFinal = calcularMedia(8, 6);
        System.out.println("Média: " + mediaFinal);

    }
}
