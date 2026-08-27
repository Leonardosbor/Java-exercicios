public class Ex21_Exceptions {
    public static void main(String[] args) {
        
       String idadeTexto = "25";

       try{
            int idade = Integer.parseInt(idadeTexto);
            System.out.println("Idade válida: " + idade);
       
        } catch(NumberFormatException e){
            System.out.println("Erro de conversão!");
        
        } finally{
            System.out.println("Conversão encerrada!")
        }
    }   
}