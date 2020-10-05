import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public interface Util {
    Consumer<String> print = System.out::print;
    public static UnaryOperator<String> maisuculo = e -> e.toUpperCase();
    public static UnaryOperator<String> primeiraLetra = e -> e.charAt(0) + "";
    public static String enfanse(String e) {
        return e + "!!!";
    }
}
