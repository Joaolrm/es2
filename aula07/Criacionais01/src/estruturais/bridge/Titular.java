package estruturais.bridge;

public class Titular {

    private String cpf;
    
    public Titular(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    private String nome;


    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
