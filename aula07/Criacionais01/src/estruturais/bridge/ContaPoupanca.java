package estruturais.bridge;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Titular titular) {
        super(numero, 0.0, titular, new CapitalizadorInflacao(), null);
    }
    
    public void capitalizar(){
        this.getCapitalizador().capitalizar(this);
    }

}
