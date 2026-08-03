public class Exercicio3 {
    public static void main(String[] args){

        String produto = "Teclado";
        double preco = 250;
        int quantidade = 3;
        boolean promocao = true;

        double valorTotalCompra = preco * quantidade;
        boolean compraGrande = valorTotalCompra >= 1000;
        boolean descontoAplicado = promocao && compraGrande;

        System.out.println("===== COMPRA =====")
        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total da compra: R$" + valorTotalCompra);
        System.out.println("Compra grande: " + compraGrande);
        System.out.println("Desconto: " + descontoAplicado);
        System.out.println("==========")


    }
}
