import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Cadastro de Conta ===");
        System.out.print("Nome do cliente: ");
        String nome = input.nextLine();

        System.out.print("Número da conta: ");
        int numero = input.nextInt();

        System.out.print("Saldo inicial: ");
        float saldo = input.nextFloat();

        input.nextLine(); // limpar buffer

        System.out.print("Tipo de conta (1 = Poupança, 2 = Corrente): ");
        int tipo = input.nextInt();

        if (tipo == 1) {
            System.out.print("Taxa de rendimento (ex: 0.05 para 5%): ");
            double taxa = input.nextDouble();

            ContaPoupanca cp = new ContaPoupanca(nome, numero, saldo, taxa);

            System.out.print("Valor para sacar: ");
            float saque = input.nextFloat();
            cp.sacar(saque);

            System.out.print("Valor para depositar: ");
            float deposito = input.nextFloat();
            cp.depositar(deposito);

            cp.calcularNovoSaldo();

            System.out.println("\n--- Dados da Conta Poupança ---");
            System.out.println("Cliente: " + cp.getCliente());
            cp.exibirSaldo();

        } else if (tipo == 2) {
            System.out.print("Limite da conta: ");
            float limite = input.nextFloat();

            ContaCorrente cc = new ContaCorrente(nome, numero, saldo, limite);

            System.out.print("Valor para sacar: ");
            float saque = input.nextFloat();
            cc.sacar(saque);

            System.out.print("Valor para depositar: ");
            float deposito = input.nextFloat();
            cc.depositar(deposito);

            System.out.println("\n--- Dados da Conta Corrente ---");
            System.out.println("Cliente: " + cc.getCliente());
            cc.exibirSaldo();

        } else {
            System.out.println("Tipo de conta inválido.");
        }

        input.close();
    }
}
