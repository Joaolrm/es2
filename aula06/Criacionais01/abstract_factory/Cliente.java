package Criacionais01.abstract_factory;

public class Cliente {

    private Botao botao;
    private CaixaTexto caixaTexto;

    public Cliente(GuiFactory factory){
        botao = factory.criaBotao();
        caixaTexto = factory.criaCaixaTexto();
    }
    public void construirTela(){

        botao.exibir();
        caixaTexto.renderizar();


    }

}
