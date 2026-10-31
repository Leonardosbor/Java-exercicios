import java.util.HashSet;

class ProdutoEx18{
    private int codigo;
    private String nome;
    private double preco;

    ProdutoEx18(int codigo, String nome, double preco){
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

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        ProdutoEx18 outroProduto = (ProdutoEx18) obj;

        return this.codigo == outroProduto.codigo;
    }


    @Override
    public int hashCode(){
        return Integer.hashCode(codigo);
    }
}

public class Ex18_Hashset {
    public static void main(String[] args) {
        HashSet<ProdutoEx18> produtos = new HashSet<>();

        produtos.add(new ProdutoEx18(111, "Guitarra", 1000));
        produtos.add(new ProdutoEx18(222, "Baixo", 950));
        produtos.add(new ProdutoEx18(333, "Teclado", 1500));
        produtos.add(new ProdutoEx18(444, "Microfone", 500));
        
        System.out.println();

        System.out.println("Quantidade: " + produtos.size());

        produtos.add(new ProdutoEx18(444, "Mesa de Som", 2000));

        System.out.println();

        System.out.println("Nova quantidade: " + produtos.size());

        System.out.println();

        for(ProdutoEx18 produto : produtos){
            System.out.println(produto);
        }

        ProdutoEx18 produtoTeste = new ProdutoEx18(333, "Violino", 1200);

        System.out.println();

        System.out.println(produtos.contains(produtoTeste));

        System.out.println();
    }
}
