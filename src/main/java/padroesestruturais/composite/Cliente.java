package composite;

public class Cliente extends NotaFiscal {

    private String cpf;

    public Cliente(String descricao, String cpf) {
        super(descricao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNotaFiscal() {
        return "Cliente: " + this.getDescricao() + " - CPF: "
                + this.cpf + "\n";
    }
}
