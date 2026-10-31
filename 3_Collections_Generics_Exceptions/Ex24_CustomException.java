class IdadeInvalidaException extends Exception{
    
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }
}


class CadastroEx24{
    private String nome;
    private int idade;

    public CadastroEx24(String nome, int idade) throws IdadeInvalidaException{
        if(idade < 0 || idade > 120){
            throw new IdadeInvalidaException("Idade inválida!");
        }

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){return nome;}
    public int getIdade(){return idade;}


    public void mostrarCadastro(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cadastro realizado com sucesso!");
    }


    
}

public class Ex24_CustomException {
    public static void main(String[] args) {
        
        try{
            CadastroEx24 cliente = new CadastroEx24("Fulano", 50);
            cliente.mostrarCadastro();
        
        } catch (IdadeInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}
