import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Produto notebookSamsung = new Produto("Notebook Samsung", 3000);
        Predicate<Produto> isCaro = produto -> produto.getPreco() > 2500;
        System.out.println(isCaro.test(notebookSamsung));
    }
}
