package facade;

public class Venda extends Setor{

    private static Venda venda = new Venda();

    private Venda() {};
    public static Venda getInstancia(){
        return venda;
    }

}
