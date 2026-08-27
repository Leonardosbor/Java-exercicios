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
            throw new IllegalArgumentException("Valor inválido para saque!");
        }

        if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente para saque!");
        }

        System.out.println("Saque realizado no valor de: R$" + valor);
        this.saldo = saldo - valor;
        System.out.println();
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}

public class Ex22_Throw {
    public static void main(String[] args) {
        
        ContaEx22 conta = new ContaEx22(123456, "Fulano", 1000);

        try{
            conta.sacar(500);
            
        } catch(IllegalArgumentException e){
            System.out.println("Saque não realizado.");
            System.out.println("Motivo: " + e.getMessage());
        }

    }
}
