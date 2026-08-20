class Veiculo{
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void mostrarDados(){
        System.out.println();
        System.out.println("=== DADOS DO VEÍCULO ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
    }
}

class Carro extends Veiculo{
    private int quantidadePortas;
    
    public Carro(String marca, String modelo, int ano, int quantidadePortas){
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas(){
        return quantidadePortas;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Portas: " + quantidadePortas);
    }
    
    public void abrirPortaMalas(){
        System.out.println();
        System.out.println("Porta-malas aberto!");
        System.out.println();
    }

}

public class Ex08_Heranca {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 1991, 2);

        carro.mostrarDados();
        carro.abrirPortaMalas();
    }
}
