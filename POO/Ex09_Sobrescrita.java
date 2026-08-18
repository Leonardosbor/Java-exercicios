class Funcionario{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void apresentar(){
        System.out.println();
        System.out.println("=== DADOS FUNCIONÁRIO(A) ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: R$" + getSalario());
        
    }
}

class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, double salario, String setor){
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor(){
        return setor;
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Setor: " + getSetor());
    }
}

class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return linguagem;
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Linguagem: " + getLinguagem());
    }
}

public class Ex09_Sobrescrita {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alberto", 5000, "Financeiro");

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 4000, "Java");

        gerente.apresentar();
        desenvolvedor.apresentar();
    }
}
