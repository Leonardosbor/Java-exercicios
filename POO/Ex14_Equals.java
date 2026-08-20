class PedidoEx14{
    private int numeroPedido;
    private String cliente;
    private double valor;

    PedidoEx14(int numeroPedido, String cliente, double valor){
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }

    public String getCliente(){
        return cliente;
    }

    public double getValor(){
        return valor;
    }

    // foco do exercício: equals()
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        PedidoEx14 outroPedido = (PedidoEx14) obj;

        return this.numeroPedido == outroPedido.numeroPedido;
    }
}

public class Ex14_Equals {
    public static void main(String[] args) {
        
        PedidoEx14 pedido1 = new PedidoEx14(100, "Alberto", 500);
        PedidoEx14 pedido2 = new PedidoEx14(200, "Carlos", 600);
        PedidoEx14 pedido3 = new PedidoEx14(100, "André", 900);

        System.out.println(pedido1.equals(pedido2));
        System.out.println(pedido1.equals(pedido3));

    }
}