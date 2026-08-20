class ProdutoEx03{
    private String nome;
    private double preco;
    private int estoque;

    ProdutoEx03(String nome, double preco, int estoque){
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

    public void setPreco(double preco){
        // validação para evitar preço negativo
        if(preco >= 0){
            this.preco = preco;
        }
    }
}

public class Ex03_Encapsulamento{
    
    public static void main(String[] args) {
        
        ProdutoEx03 produto1 = new ProdutoEx03("Guitarra", 1000, 10);

        System.out.println();
        System.out.println(produto1.getNome());
        System.out.println(produto1.getEstoque());
        System.out.println();

        produto1.setPreco(2000);

        System.out.println(produto1.getPreco());
        System.out.println();
        
    }
    
}
