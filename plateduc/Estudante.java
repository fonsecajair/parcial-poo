public class Estudante extends Pessoa {
    private String curso;
    private String matricula;

    public Estudante(String nome, String dataNascimento, String email, String curso, String matricula) {
        super(nome, dataNascimento, email);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Email: " + getEmail());
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
    }
}
