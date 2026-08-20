class ProdutoEx02{
        String nome;
        double preco;
        int estoque;

        ProdutoEx02(String nome, double preco, int estoque){

            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;

        }
    }

public class Ex02_Construtor{
    public static void main(String[] args){

        ProdutoEx02 produto1 = new ProdutoEx02("Guitarra", 2000, 10);
        ProdutoEx02 produto2 = new ProdutoEx02("Baixo", 1800, 2);
        ProdutoEx02 produto3 = new ProdutoEx02("Teclado", 1500, 5);

        System.out.println();
        System.out.println("Produto: " + produto1.nome);
        System.out.println("Preço: R$" + produto1.preco);
        System.out.println("Estoque: " + produto1.estoque);
        System.out.println();

        System.out.println("Produto: " + produto2.nome);
        System.out.println("Preço: R$" + produto2.preco);
        System.out.println("Estoque: " + produto2.estoque);
        System.out.println();

        System.out.println("Produto: " + produto3.nome);
        System.out.println("Preço: R$" + produto3.preco);
        System.out.println("Estoque: " + produto3.estoque);
        System.out.println();

    }
}