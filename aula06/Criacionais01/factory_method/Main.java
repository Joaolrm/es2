package Criacionais01.factory_method;

public class Main{

    
public static void main(String[] args) {
    
    ProcessadorTexto word = new ProcessadorTexto();
    Documento relatorio = word.novoDocumento("Relatorio");
    Documento curriculo = word.novoDocumento("Curriculo");

    relatorio.salvar();
    curriculo.salvar();


} 

}