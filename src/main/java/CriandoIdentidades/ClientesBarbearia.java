package CriandoIdentidades;

public class ClientesBarbearia {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String numeroCelular;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public ClientesBarbearia(String nome, String cpf, String dataNascimento, String numeroCelular) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.numeroCelular = numeroCelular;
    }
    public ClientesBarbearia(){
        this("","","","");
    }
    public String toString(){
        return this.numeroCelular+","+this.nome+","+this.cpf+","+this.dataNascimento;

    }}


