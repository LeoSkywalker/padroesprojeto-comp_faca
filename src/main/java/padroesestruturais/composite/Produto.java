package composite;

import java.util.ArrayList;
import java.util.List;

public class Produto extends NotaFiscal {

    private List<NotaFiscal> notasFiscais;

    public Produto(String descricao) {
        super(descricao);
        this.notasFiscais = new ArrayList<NotaFiscal>();
    }

    public void addNotaFiscal(NotaFiscal notaFiscal){
        this.notasFiscais.add(notaFiscal);
    }

    public String getNotaFiscal() {
        String saida = "";
        saida = "Produto: " + this.getDescricao() + "\n";
        for(NotaFiscal notaFiscal : notasFiscais){
            saida += notaFiscal.getNotaFiscal();
        }
        return saida;
    }
}
