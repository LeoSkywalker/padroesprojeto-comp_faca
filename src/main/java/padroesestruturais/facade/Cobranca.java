package facade;

public class Cobranca extends Setor{

    private static Cobranca cobranca = new Cobranca();

    private Cobranca() {};

    public static Cobranca getInstancia(){
        return cobranca;
    }
}
