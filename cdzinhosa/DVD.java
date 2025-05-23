public class DVD extends Produto {
    private int duracao;

    public DVD() {
    }

    public DVD(String titulo, double preco, int duracao) {
        super(titulo, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Duração: " + duracao + " minutos");
    }
}
