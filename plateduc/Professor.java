public class Professor extends Pessoa {
    private String especialidade;
    private String departamento;

    public Professor(String nome, String dataNascimento, String email, String especialidade, String departamento) {
        super(nome, dataNascimento, email);
        this.especialidade = especialidade;
        this.departamento = departamento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Email: " + getEmail());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Departamento: " + departamento);
    }
}
