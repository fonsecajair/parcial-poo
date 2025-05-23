public class Produto {
    private String titulo;
    private double preco;

    public Produto() {
    }

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Preço: R$" + preco);
    }
}
