import java.util.Random;

public class Prova implements AtividadeAcademica {
    private double nota;

    @Override
    public void realizarAtividade() {
        System.out.println("Realizando prova...");
        System.out.println("Prova realizada com sucesso!");
    }

    @Override
    public void avaliarAtividade() {
        Random random = new Random();
        nota = 6 + (4 * random.nextDouble()); // Nota entre 6.0 e 10.0
        System.out.printf("Nota atribuída: %.2f\n", nota);
    }

    public double getNota() {
        return nota;
    }
}
