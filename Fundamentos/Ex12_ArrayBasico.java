// Exercicio de ARRAY + FOR

public class Ex12_ArrayBasico{
    public static void main(String[] args) {

        String[] produtos = new String[5];

        produtos[0] = "Guitarra";
        produtos[1] = "Baixo";
        produtos[2] = "Bateria";
        produtos[3] = "Microfone";
        produtos[4] = "Teclado";
        
        for(int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i]);
        }
    }
}