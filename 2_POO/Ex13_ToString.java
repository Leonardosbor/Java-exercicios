class ProdutoEx13{
    private String codigo;
    private String nome;
    private double preco;

    public ProdutoEx13(String codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    // foco do exercício: toString()
    @Override
    public String toString(){
        return "Código: " + codigo +
               " | Nome: " + nome + 
               " | Preço: " + preco; 
    }

}

public class Ex13_ToString {
    public static void main(String[] args) {
        ProdutoEx13 produto1 = new ProdutoEx13("ABC123", "Guitarra", 2000);

        ProdutoEx13 produto2 = new ProdutoEx13("DEF456", "Contrabaixo", 2000);

        System.out.println();    
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println();
    }
}
