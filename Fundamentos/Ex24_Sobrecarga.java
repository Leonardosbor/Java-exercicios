public class Ex24_Sobrecarga {
    
    public static int calcular(int numero){
        return numero * 2;
    }

    public static int calcular(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static double calcular(double numero1, double numero2){
        return (numero1 + numero2) / 2;
    }

    public static void main(String[] args) {
        
        System.out.println();
        System.out.println(calcular(10));
        System.out.println(calcular(10, 20));
        System.out.println(calcular(8.5, 7.5));
        System.out.println();
        
    }
}
