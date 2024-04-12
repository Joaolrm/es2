package Criacionais01.factory_method;

public class ProcessadorTexto extends AplicativoFactory{

    public Documento criaDocumento(String tipo){

        if(tipo.equalsIgnoreCase("Relatorio")){
            return new Relatorio();
        }

        else if(tipo.equalsIgnoreCase("Curriculo")){
            return new Curriculo();
        }
        
        return null;
    }
    
}
