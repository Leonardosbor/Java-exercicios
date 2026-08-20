class Colaborador{
    private String nome;
    private double salario;

    public Colaborador(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void trabalhar(){
        System.out.println("Funcionário trabalhando!");
    }
}

class TechLead extends Colaborador{

    public TechLead(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        System.out.println("TechLead administrando a equipe!");
    }
}

class DevPleno extends Colaborador{

    public DevPleno(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void trabalhar(){
        System.out.println("Dev Pleno escrevendo código!");
    }
}

public class Ex10_Polimorfismo {
    public static void main(String[] args) {
        
        Colaborador funcionario1 = new TechLead("André", 3000);
        
        Colaborador funcionario2 = new DevPleno("Antonio", 2000);

        funcionario1.trabalhar();
        funcionario2.trabalhar();

    }
}
