class Endereco{
    private String rua;
    private String cidade;
    private String estado;

    Endereco(String rua, String cidade, String estado){
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua(){
        return rua;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

}

class Cliente{
    private String nome;
    private Endereco endereco;

    Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }
}

public class Ex06_Composicao {
    public static void main(String[] args) {
        
    }
}







