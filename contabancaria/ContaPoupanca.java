public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String cliente, int numConta, float saldo, double taxaRendimento) {
        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularNovoSaldo() {
        float novoSaldo = (float) (getSaldo() + (getSaldo() * taxaRendimento));
        setSaldo(novoSaldo);
    }
}
