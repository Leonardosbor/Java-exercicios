class ContaEx15{
    private int numeroConta;
    private String titular;
    private double saldo;

    ContaEx15(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        ContaEx15 outraConta = (ContaEx15) obj;

        return this.numeroConta == outraConta.numeroConta;
    }


    @Override
    public int hashCode(){
        return Integer.hashCode(numeroConta);
    }
}

public class Ex15_HashCode {
    public static void main(String[] args){
        ContaEx15 conta1 = new ContaEx15(123456, "Anselmo", 10000);

        ContaEx15 conta2 = new ContaEx15(123456, "Paulo", 11000);


        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.hashCode());
        System.out.println(conta2.hashCode());
    }    
}
