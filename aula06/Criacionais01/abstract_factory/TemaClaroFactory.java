package Criacionais01.abstract_factory;

public class TemaClaroFactory implements GuiFactory{

    @Override
    public Botao criaBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaTexto criaCaixaTexto() {
        return new CaixaTextoClaro();
    }
    
}
