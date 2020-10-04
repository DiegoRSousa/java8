import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media1 = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media1.apply(5.0, 3.0));
        BiFunction<Integer, Integer, String> media2 = (n1, n2) -> "A média é: " + (n1 + n2) / 2;
        System.out.println(media2.apply(5, 3));
    }
}
