package estruturais.bridge;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, Titular titular) {
        super(numero, 0.0, titular, null, new CestaDeServicos());
    }
    
    public void cobrarTarifa(){
        this.getTarifador().cobrarTarifa(this);
    }

}
