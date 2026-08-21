import java.util.ArrayList;

class ProdutoEx16{
    private int codigo;
    private String nome;
    private double preco;

    ProdutoEx16(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return "Código: " + codigo + " | Nome: " + nome + " | Preço: R$" + preco;
    }
}

public class Ex16_ArrayList{
    public static void main(String[] args){
         
        ArrayList<ProdutoEx16> produtos = new ArrayList<>();

        produtos.add(new ProdutoEx16(1111, "Guitarra", 1500));
        produtos.add(new ProdutoEx16(2222, "Baixo", 1200));
        produtos.add(new ProdutoEx16(3333, "Bateria", 4000));
        produtos.add(new ProdutoEx16(4444, "Violino", 2500));
        produtos.add(new ProdutoEx16(5555, "Teclado", 2500));

        System.out.println();
        for(ProdutoEx16 produto : produtos){
            System.out.println(produto);
        }

        System.out.println();
        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println();

        System.out.println(produtos.get(0));
        System.out.println();

        produtos.remove(4);

        for(ProdutoEx16 produto : produtos){
            System.out.println(produto);
        }

        System.out.println();
    }
}