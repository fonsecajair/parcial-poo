public abstract class Pessoa {
    private String nome;
    private String dataNascimento;
    private String email;

    public Pessoa(String nome, String dataNascimento, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public abstract void mostrarInformacoes();
}
