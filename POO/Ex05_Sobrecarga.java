class ProdutoEx05{
    private String nome;
    private double preco;
    private int estoque;

    ProdutoEx05(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            estoque += quantidade;
        }
    }

    public void adicionarEstoque(int quantidade, String motivo){
        if(quantidade > 0){
            estoque += quantidade;
            System.out.println("Motivo: " + motivo);
        }
    }

    public void removerEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= estoque){
            estoque -= quantidade;
        }
    }

    public int getEstoque(){
        return estoque;
    }
}

public class Ex05_Sobrecarga {
    public static void main(String[] args) {
        
        ProdutoEx05 produto1 = new ProdutoEx05("Guitarra", 2000, 10);
        
        System.out.println();
        System.out.println(produto1.getEstoque());

        produto1.adicionarEstoque(5);

        System.out.println(produto1.getEstoque());

        produto1.adicionarEstoque(10, "Compra com fornecedor");

        
        System.out.println(produto1.getEstoque());

        produto1.removerEstoque(10);

        System.out.println(produto1.getEstoque());
        System.out.println();

    }
}
