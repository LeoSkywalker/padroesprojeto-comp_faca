package composite;

public abstract class NotaFiscal {

    private String descricao;

    public NotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getNotaFiscal();
}