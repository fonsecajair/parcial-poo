import java.util.ArrayList;

public class Plataforma {
    public static void main(String[] args) {
        // Lista de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Estudante("João Silva", "10/02/2000", "joao@gmail.com", "Engenharia da Computação", "12345"));
        pessoas.add(new Professor("Dra. Ana Paula", "22/08/1980", "ana@universidade.edu", "Inteligência Artificial", "Ciência da Computação"));

        // Lista de atividades
        ArrayList<AtividadeAcademica> atividades = new ArrayList<>();
        atividades.add(new Prova());
        atividades.add(new Trabalho());

        // Exibir informações
        System.out.println("--- Informações dos Usuários ---\n");
        for (Pessoa p : pessoas) {
            p.mostrarInformacoes();
            System.out.println();
        }

        // Executar atividades
        System.out.println("--- Execução das Atividades ---\n");
        for (AtividadeAcademica atividade : atividades) {
            atividade.realizarAtividade();
            atividade.avaliarAtividade();
            System.out.println();
        }
    }
}
