public class Ex21_MetodoComParametro {
    
    public static void apresentarPessoa(String nome, int idade){
        System.out.println("Olá, meu nome é " + nome + ".");
        System.out.println("Tenho " + idade + " anos.");
    }
    public static void main(String[] args) {

        apresentarPessoa("Leonardo", 32);
        
    }
}
