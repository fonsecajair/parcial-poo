public class Contas {
    public static void main(String[] args) {
        // Conta Poupança
        ContaPoupanca cp = new ContaPoupanca("João", 1234, 1000.0f, 0.05);
        System.out.println("--- Conta Poupança ---");
        cp.exibirSaldo();
        cp.depositar(200.0f);
        cp.sacar(100.0f);
        cp.calcularNovoSaldo();
        cp.exibirSaldo();

        System.out.println();

        // Conta Corrente
        ContaCorrente cc = new ContaCorrente("Maria", 5678, 500.0f, 300.0f);
        System.out.println("--- Conta Corrente ---");
        cc.exibirSaldo();
        cc.sacar(700.0f); // dentro do limite
        cc.exibirSaldo();
        cc.sacar(200.0f); // fora do limite
        cc.exibirSaldo();
    }
}
