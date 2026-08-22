import java.util.ArrayList;

class ProdutoEx17{
    private int codigo;
    private String nome;
    private double preco;

    ProdutoEx17(int codigo, String nome, double preco){
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

public class Ex17_SetContainsIndexOf {
    public static void main(String[] args) {
        ArrayList<ProdutoEx17> produtos = new ArrayList<>();

        produtos.add(new ProdutoEx17(1111, "Violão", 1000));
        produtos.add(new ProdutoEx17(2222, "Guitarra", 2000));
        produtos.add(new ProdutoEx17(3333, "Viola", 500));
        produtos.add(new ProdutoEx17(4444, "Violino", 1000));
        produtos.add(new ProdutoEx17(5555, "Teclado", 2500));

        ProdutoEx17 produtoTeste = new ProdutoEx17(3333, "Viola", 500);

        System.out.println(produtos.contains(produtoTeste));

        System.out.println();
        for(ProdutoEx17 produto : produtos){
            System.out.println(produto);
        }

        System.out.println();
        produtos.set(4, new ProdutoEx17(6666, "Microfone", 500));

        System.out.println();
        System.out.println(produtos.get(0));

        System.out.println();
        System.out.println(produtos.indexOf(produtos.get(1)));
        
        System.out.println();
        System.out.println(produtos.contains(produtos.get(2)));
        System.out.println();
        
        
    }
}
