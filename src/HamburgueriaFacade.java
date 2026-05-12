package facade;

public class HamburgueriaFacade {

    private Cozinha cozinha;
    private Pagamento pagamento;
    private Entrega entrega;

    public HamburgueriaFacade() {
        cozinha = new Cozinha();
        pagamento = new Pagamento();
        entrega = new Entrega();
    }

    public void fazerPedidoCombo() {

        System.out.println("Pedido do Cliente");

        cozinha.prepararHamburguer();
        cozinha.prepararBatata();
        cozinha.prepararRefrigerante();

        pagamento.realizarPagamento(35.00);

        entrega.enviarPedido();

        System.out.println("Pedido Finalizado");
    }
}