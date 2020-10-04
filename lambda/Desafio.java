import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    /*1. A partir do produto calcular o preço real com desconto
      2. Imposto municipal: >= 2500 (8,5) < 2500 Isento
      3. Frete >= 3000 (100) < 3000 (50)
      4. Arredondar para 2 casas decimais
      5. Formatar: R$1234,56
    */
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 3400, 10);

        Function<Produto, Double> precoComDesconto = 
                produto -> produto.getPreco() * (1 - produto.getDesconto() / 100);
        UnaryOperator<Double> precoComImposto = preco -> preco >= 2500 ? preco * (1.085) : preco;
        UnaryOperator<Double> precoComFrete =  preco -> preco >= 3000 ? preco + 100 : preco + 50;   
        Function<Double, String> precoArrendodado = preco -> String.format("%.2f", preco);
        UnaryOperator<String> precoFormatado = preco -> "R$" + preco;

        var precoFinal = precoComDesconto
                            .andThen(precoComImposto)
                            .andThen(precoComFrete)
                            .andThen(precoArrendodado)
                            .andThen(precoFormatado)
                            .apply(notebook);
        System.out.println(precoFinal);
    }
}
