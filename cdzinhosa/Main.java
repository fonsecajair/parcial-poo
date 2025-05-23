import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Cadastro de CD
        System.out.println("Cadastro de CD:");
        System.out.print("Título do CD: ");
        String tituloCd = input.nextLine();
        System.out.print("Preço do CD: ");
        double precoCd = input.nextDouble();
        System.out.print("Número de faixas: ");
        int faixas = input.nextInt();

        CD cd = new CD(tituloCd, precoCd, faixas);

        input.nextLine(); // Limpar o buffer

        // Cadastro de DVD
        System.out.println("\nCadastro de DVD:");
        System.out.print("Título do DVD: ");
        String tituloDvd = input.nextLine();
        System.out.print("Preço do DVD: ");
        double precoDvd = input.nextDouble();
        System.out.print("Duração em minutos: ");
        int duracao = input.nextInt();

        DVD dvd = new DVD(tituloDvd, precoDvd, duracao);

        // Exibição dos dados
        System.out.println("\n--- CD ---");
        cd.exibirDados();

        System.out.println("\n--- DVD ---");
        dvd.exibirDados();

        input.close();
    }
}
