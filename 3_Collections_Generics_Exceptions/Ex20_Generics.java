class Gaveta<T>{
    private T objeto;

    public Gaveta(T objeto){
        this.objeto = objeto;
    }

    public T getObjeto(){
        return objeto;
    }

    public void mostrarObjeto(){
        System.out.println("Objeto: " + objeto);
    }
}

class ProdutoEx20{
    private int codigo;
    private String nome;
    private double preco;

    ProdutoEx20(int codigo, String nome, double preco){
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
        return "Código: " + codigo + " | Nome: " + nome + "| Preço: R$" + preco; 
    }
}


public class Ex20_Generics {
    public static void main(String[] args) {
        Gaveta<Integer> codigoFerramenta = new Gaveta<>(1111);
        Gaveta<String> nomeFerramenta = new Gaveta<>("Martelo");
        Gaveta<Double> precoFerramenta = new Gaveta<>(9.99);

        System.out.println();

        codigoFerramenta.mostrarObjeto();
        nomeFerramenta.mostrarObjeto();
        precoFerramenta.mostrarObjeto();

        System.out.println();

        int codFerramenta = codigoFerramenta.getObjeto();
        String ferramenta = nomeFerramenta.getObjeto();
        double valorFerramenta = precoFerramenta.getObjeto();

        System.out.println(codFerramenta);
        System.out.println(ferramenta);
        System.out.println(valorFerramenta);


        ProdutoEx20 novaFerramenta = new ProdutoEx20(2222, "Furadeira", 10.99);

        Gaveta<ProdutoEx20> outraFerramenta = new Gaveta<>(novaFerramenta);

        outraFerramenta.mostrarObjeto();
        

    }
}
