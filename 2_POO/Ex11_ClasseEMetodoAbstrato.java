// classe abstrata
abstract class MeioDeTransporte{
    private String marca;
    private String modelo;

    public MeioDeTransporte(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void mostrarDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }

    // método abstrato
    public abstract void mover();
}


class Automovel extends MeioDeTransporte{

    public Automovel(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void mover(){
        System.out.println("O carro está se movendo pelas ruas!");
    }
}


class Barco extends MeioDeTransporte{

    public Barco(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void mover(){
        System.out.println("O barco está navegando!");
    }
}


public class Ex11_ClasseEMetodoAbstrato {
    public static void main(String[] args) {
        MeioDeTransporte veiculo1 = new Automovel("VW", "Gol" );

        MeioDeTransporte veiculo2 = new Barco("Não identificado", "Não identificado");

        veiculo1.mostrarDados();
        veiculo1.mover();

        System.out.println();

        veiculo2.mostrarDados();
        veiculo2.mover();
    }
}
