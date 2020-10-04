public class Produto {
    private String descricao;
    private double preco;
    private double desconto;

    Produto(String descricao, double preco, double desconto) {
        this.descricao = descricao;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }
}
