package facade;

public class ClienteFacade {

    public static boolean verificarPendenciasCompra(Cliente cliente) {
        if (Venda.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Cobranca.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
