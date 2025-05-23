public class CD extends Produto {
    private int numeroDeFaixas;

    public CD() {
    }

    public CD(String titulo, double preco, int numeroDeFaixas) {
        super(titulo, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de faixas: " + numeroDeFaixas);
    }
}
