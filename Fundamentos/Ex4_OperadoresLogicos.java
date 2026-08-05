public class Ex4_OperadoresLogicos {
    public static void main(String[] args){


        String nomeCLiente = "Leonardo Reis";
        double salario = 5000;
        int idade = 32;
        boolean possuiDividas = false;

        boolean aprovado = salario >= 3000 && idade >= 18 && !possuiDividas;


        System.out.println("Nome cliente: " + nomeCLiente);
        System.out.println("Salário: R$" + salario);
        System.out.println("Idade: " + idade);
        System.out.println("Possui dívidas: " + possuiDividas);
        System.out.println("Aprovado: " + aprovado);


    }
}
