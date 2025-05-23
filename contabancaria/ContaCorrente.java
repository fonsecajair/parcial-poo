public class ContaCorrente extends ContaBancaria {
    private float limite;

    public ContaCorrente() {
    }

    public ContaCorrente(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente, mesmo com limite.");
        }
    }
}
