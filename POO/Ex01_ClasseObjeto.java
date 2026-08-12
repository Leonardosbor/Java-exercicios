package POO;

class Produto{

    String nome;
    double preco;
    int estoque;

}

public class Ex01_ClasseObjeto {
    
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        
        produto1.nome = "Guitarra";
        produto1.preco = 2000;
        produto1.estoque = 10;

        produto2.nome = "Baixo";
        produto2.preco = 1800;
        produto2.estoque = 2;

        System.out.println();
        System.out.println("Produto: " + produto1.nome);
        System.out.println("Preço: " + produto1.preco);
        System.out.println("Estoque: " + produto1.estoque);
        System.out.println("Valor total em estoque: " + produto1.preco * produto1.estoque);
        System.out.println();

        System.out.println("Produto: " + produto2.nome);
        System.out.println("Preço: " + produto2.preco);
        System.out.println("Estoque: " + produto2.estoque);
        System.out.println("Valor total em estoque: " + produto2.preco * produto2.estoque);
        System.out.println();
    
    }
    
}
