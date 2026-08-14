class Endereco{
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String bairro, String cidade, String estado, String pais){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getRua(){
        return rua;
    }

    public String getBairro(){
        return bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public String getPais(){
        return pais;
    }
}


class Cliente{
    private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String email, String telefone, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getTelefone(){
        return telefone;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void mostrarDadosCliente(){
        System.out.println();
        System.out.println("=== DADOS CLIENTE ===");
        System.out.println();
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Rua: " + getEndereco().getRua());
        System.out.println("Bairro: " + getEndereco().getBairro());
        System.out.println("Cidade: " + getEndereco().getCidade() );
        System.out.println("Estado: " + getEndereco().getEstado());
        System.out.println("País: " + getEndereco().getPais());
        System.out.println();
    }
}

public class Ex06_Composicao{
    public static void main(String[] args) {
        Endereco endereco = new Endereco(
            "Emília Wundervald",
            "Itacorubi",
            "Florianópolis ",
            "Santa Catarina",
            "Brasil"
        );

        Cliente cliente = new Cliente(
            "Fulano de tal",
            "leozinho@123.com",
            "(48)32389148",
            endereco
        );

        cliente.mostrarDadosCliente();

    }
}