package estruturais.bridge;

public class Main {

    public static void main(String[] args) {
        
        Titular aline = new Titular("00000000000", "Aline");
        ContaPoupanca poupanca = new ContaPoupanca(000000, aline);
        ContaCorrente corrente = new ContaCorrente(010101, aline);
        ContaMista mista = new ContaMista(020202, aline);

        poupanca.depositar(1000.00);
        corrente.depositar(50);
        mista.depositar(5.50);

        
        System.out.println("Saldo da conta poupança R$" + poupanca.getSaldo());
        System.out.println("Saldo da conta corrente R$" + corrente.getSaldo());
        System.out.println("Saldo da conta mista R$" + mista.getSaldo());


        poupanca.capitalizar();
        corrente.cobrarTarifa();
        mista.capitalizar();
        mista.cobrarTarifa();

        System.out.println("Saldo da conta poupança R$" + poupanca.getSaldo());
        System.out.println("Saldo da conta corrente R$" + corrente.getSaldo());
        System.out.println("Saldo da conta mista R$" + mista.getSaldo());


    }
    
}