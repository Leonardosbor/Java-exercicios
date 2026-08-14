class Endereco{
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado){
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

    public Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void mostrarDadosCliente(){
        System.out.println();
        System.out.println("=== RESUMO DADOS CLIENTE ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Rua: " + getEndereco().getRua());
        System.out.println("Cidade: " + getEndereco().getCidade());
        System.out.println("Estado: " + getEndereco().getEstado());
        System.out.println();

    }
}

public class Ex06_Composicao {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco(
            "Rua Sebastião Alzemiro dos Santos", "Palhoça", 
            "Santa Catarina"
        );

        Cliente cliente = new Cliente("Leonardo", endereco);

        cliente.mostrarDadosCliente();

    }
}