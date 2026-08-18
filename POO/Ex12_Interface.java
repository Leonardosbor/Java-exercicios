interface Exportavel{
    void exportar();
}

class Relatorio implements Exportavel{
    private String titulo;
    private String autor;

    Relatorio(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public void exportar(){
        System.out.println("Relatório exportado com sucesso!");
    }
}


class Planilha implements Exportavel{
    private String nome;
    private int quantidadeLinhas;

    Planilha(String nome, int quantidadeLinhas){
        this.nome = nome;
        this.quantidadeLinhas = quantidadeLinhas;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidadeLinhas(){
        return quantidadeLinhas;
    }

    @Override
    public void exportar(){
        System.out.println("Planilha exportada com sucesso!");
    }
}

public class Ex12_Interface {
    public static void main(String[] args) {
        Exportavel arquivo1 = new Relatorio("Orçamento Julho", "Paulo");

        Exportavel arquivo2 = new Planilha("Gastos Extras", 50);

        arquivo1.exportar();
        arquivo2.exportar();
    }
}
