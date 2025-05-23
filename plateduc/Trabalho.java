import java.util.Random;

public class Trabalho implements AtividadeAcademica {
    private double nota;

    @Override
    public void realizarAtividade() {
        System.out.println("Realizando trabalho...");
        System.out.println("Trabalho entregue com sucesso!");
    }

    @Override
    public void avaliarAtividade() {
        Random random = new Random();
        nota = 5 + (5 * random.nextDouble()); // Nota entre 5.0 e 10.0
        System.out.printf("Nota atribuída: %.2f\n", nota);
    }

    public double getNota() {
        return nota;
    }
}
