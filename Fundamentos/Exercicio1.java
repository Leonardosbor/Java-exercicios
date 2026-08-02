public class Exercicio1{
    public static void main(String[] args){

        String produto = "Guitarra";
        double preco = 1500;
        int estoque = 50;
        boolean disponivel = true;

        double valorTotal = preco * estoque;
        System.out.println("O valor total do produto é de R$" + valorTotal + " reais.");

    }
}