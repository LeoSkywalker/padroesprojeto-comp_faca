package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveRetornarPendenciaVendaCompra() {
        Cliente cliente = new Cliente();
        Venda.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void deveRetornarPendenciaCobrancaCompra() {
        Cliente cliente = new Cliente();
        Cobranca.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void deveRetornarPendenciaFinanceiroCompra() {
        Cliente cliente = new Cliente();
        Financeiro.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void deveRetornarClienteSemPendenciaCompra(){
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.comprar());
    }
}
