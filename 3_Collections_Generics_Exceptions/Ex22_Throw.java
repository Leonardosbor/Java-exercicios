class ContaEx22{
    private int numero;
    private String titular;
    private double saldo;

    ContaEx22(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }


    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor inválido");
        }

        if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
            
        }

        System.out.println();
        System.out.println("Saque realizado com sucesso!");

        this.saldo = saldo - valor;

        System.out.println("Saldo atual: R$" + this.saldo);
        System.out.println();
    }
}


public class Ex22_Throw {
    public static void main(String[] args) {
        
        ContaEx22 conta0 = new ContaEx22(123, "Fulano", 2000);
        ContaEx22 conta1 = new ContaEx22(456, "John Doe", 4000);
        ContaEx22 conta2  = new ContaEx22(789, "Jane Doe", 3000);

        
        try{
            conta2.sacar(2000);
            conta1.sacar(3000);
            conta0.sacar(2100);
            
        
        } catch (IllegalArgumentException e){
            System.out.println("Saque não realizado!");
            System.out.println("Motivo: " + e.getMessage());
            System.out.println();
        }

    }
}
