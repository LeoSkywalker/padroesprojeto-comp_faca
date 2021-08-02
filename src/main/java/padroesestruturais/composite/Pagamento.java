package composite;

public class Pagamento {

    private NotaFiscal notaFiscal;

    public String getNotaFiscal() {
        if (this.notaFiscal == null) {
            throw new NullPointerException("Pagamento sem nota fiscal");
        }
        return this.notaFiscal.getNotaFiscal();
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
