class ProdutoEx04{
    private String nome;
    private double preco;
    private int estoque;

    ProdutoEx04(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    // método para add item ao estoque 
    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            estoque += quantidade;
        }
    }

    // método para remover item do estoque
    public void removerEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= estoque){
            estoque -= quantidade;
        }
    }

    // método para calcular valor total do estoque
    public double calcularValorTotal(){
        return preco * estoque;
    } 
}

public class Ex04_Método {
    public static void main(String[] args) {
        
        ProdutoEx04 produto1 = new ProdutoEx04("Guitarra", 5000, 10);

        System.out.println();
        System.out.println("Estoque inicial: " + produto1.getEstoque());

        produto1.adicionarEstoque(20);

        System.out.println("Após adicionar: " + produto1.getEstoque());
        
        produto1.removerEstoque(10);

        System.out.println("Após remover: " + produto1.getEstoque());

        System.out.println("Valor total: R$" + produto1.calcularValorTotal());
        System.out.println();
    }
}
