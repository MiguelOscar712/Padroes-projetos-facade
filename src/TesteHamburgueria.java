package facade;

public class TesteHamburgueria {

    public static void main(String[] args) {

        System.out.println("TESTES HAMBURGUERIA");

        // CT01
        System.out.println("\nCT01 - Criando fachada");

        HamburgueriaFacade facade = new HamburgueriaFacade();

        System.out.println("Facade criada com sucesso!");


        System.out.println("\nCT02 ao CT10 - Executando pedido completo");

        facade.fazerPedidoCombo();

        System.out.println("\nFIM DOS TESTES");
    }
}