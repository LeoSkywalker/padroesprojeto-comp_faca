package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void deveRetornarNotaPagamento() {
        Produto produto1 = new Produto("Arroz 5kg");
        Produto produto2 = new Produto("Feijão 1kg");
        Cliente cliente1 = new Cliente("Leonardo", "11100855432");
        produto2.addNotaFiscal(cliente1);
        produto1.addNotaFiscal(cliente1);

        Produto produto3 = new Produto("Óleo de Soja 1L");
        Cliente cliente2 = new Cliente("Ana Clara", "11100554833");
        produto3.addNotaFiscal(cliente2);

        Produto notaFiscal = new Produto("Lista - 30/07/21");
        notaFiscal.addNotaFiscal(produto1);
        notaFiscal.addNotaFiscal(produto2);
        notaFiscal.addNotaFiscal(produto3);

        Pagamento pagamento = new Pagamento();
        pagamento.setNotaFiscal(notaFiscal);

        assertEquals("Produto: Lista - 30/07/21\n" +
                "Produto: Arroz 5kg\n" +
                "Cliente: Leonardo - CPF: 11100855432\n" +
                "Produto: Feijão 1kg\n" +
                "Cliente: Leonardo - CPF: 11100855432\n" +
                "Produto: Óleo de Soja 1L\n" +
                "Cliente: Ana Clara - CPF: 11100554833\n", pagamento.getNotaFiscal());
    }

    @Test
    void deveRetornarExcecaoPagamentoSemNota(){
        try {
            Pagamento pagamento = new Pagamento();
            pagamento.getNotaFiscal();
            fail();
        } catch (NullPointerException e){
            assertEquals("Pagamento sem nota fiscal", e.getMessage());
        }
    }
}
