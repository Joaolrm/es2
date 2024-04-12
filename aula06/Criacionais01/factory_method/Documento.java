package Criacionais01.factory_method;

public abstract class Documento {

    public abstract void abrir();
    public abstract void salvar();
    public void fechar(){
        System.out.println("Fechar na casse pai");
    };
    
}
