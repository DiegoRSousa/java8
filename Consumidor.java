import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<Produto> imprimirNome = p -> System.out.println(p.getDescricao() + " - " + p.getPreco());
        Produto produto = new Produto("Refrigerante", 3.75);
        imprimirNome.accept(produto);
    }
}
