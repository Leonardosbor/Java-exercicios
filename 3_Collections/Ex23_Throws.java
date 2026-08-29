public class Ex23_Throws {

    public static void validarNota(double nota) throws Exception{
        if(nota < 0 || nota > 10){
            throw new Exception("Nota inválida");
        }

        System.out.println("Nota válida!");
    }
    public static void main(String[] args) {
        
        try{
            validarNota(11);
        
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
