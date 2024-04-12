package Criacionais01.abstract_factory;

public class TemaEscuroFactory implements GuiFactory{

    @Override
    public Botao criaBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaTexto criaCaixaTexto() {
        return new CaixaTextoEscuro();
    }
    
}
