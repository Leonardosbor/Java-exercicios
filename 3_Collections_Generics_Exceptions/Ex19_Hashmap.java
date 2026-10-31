import java.util.HashMap;

class LivroEx19{
    private String isbn;
    private String titulo;
    private String autor;

    LivroEx19(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public String toString(){
        return "ISBN: " + isbn + " | Título: " + titulo + " | Autor(a): " + autor; 
    }

}

public class Ex19_Hashmap {
    public static void main(String[] args) {
        HashMap<String, LivroEx19> livros = new HashMap<>();

        livros.put("111", new LivroEx19("111", "Harry Potter 1", "JKR"));

        livros.put("222", new LivroEx19("222", "Harry Potter 2", "JKR"));

        livros.put("333", new LivroEx19("333", "Harry Potter 3", "JKR"));

        livros.put("444", new LivroEx19("444", "Harry Potter 4", "JKR"));

        livros.put("555", new LivroEx19("555", "Harry Potter 5", "JKR"));

        System.out.println(livros.get("111"));
        System.out.println(livros.containsKey("444"));

        livros.remove("222");

        for(LivroEx19 livro : livros.values()){
            System.out.println(livro);
        }

        System.out.println(livros.size());

        livros.put("333", new LivroEx19("333", "Naruto", "Kishimoto"));

        System.out.println(livros.get("333"));

        for(LivroEx19 livro :livros.values()){
            System.out.println(livro);
        }
    }
}
