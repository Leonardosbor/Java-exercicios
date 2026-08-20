class Livro{
    private String titulo;
    private String autor;

    Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
}

class Biblioteca{
    private String nome;
    private Livro livro;

    Biblioteca(String nome, Livro livro){
        this.nome = nome;
        this.livro = livro;
    }

    public String getNome(){
        return nome;
    }

    public Livro getLivro(){
        return livro;
    } 

    public void mostrarLivro(){
        System.out.println();
        System.out.println("=== Dados do Livro ===");
        System.out.println("Biblioteca: " + getNome());
        System.out.println("Livro: " + getLivro().getTitulo());
        System.out.println("Autor: " + getLivro().getAutor());
        System.out.println();
    }
}

public class Ex07_Agregacao {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Aneis", "J. R. R. Tolkien");
        Livro livro2 = new Livro("Harry Potter", "J. K. Rowling");

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca SC", livro1);
        Biblioteca biblioteca2 = new Biblioteca("Livraria da Cidade", livro2);

        biblioteca1.mostrarLivro();
        biblioteca2.mostrarLivro();
    }
}
