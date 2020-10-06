import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    /*
    1. Numero para string binária... 6 => "110"
    2. Inverter a string... "110" => "011"
    3. Converter de volta para inteiro "011" => 3
    */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2 ,3 ,4, 5, 6, 7, 8, 9);
        UnaryOperator<String> inverter = v -> new StringBuilder(v).reverse().toString();
        Function<String, Integer> binarioParaInteiro = v -> Integer.parseInt(v, 2);

        nums.stream()
            .map(Integer::toBinaryString)
            .map(inverter)
            .map(binarioParaInteiro)
            .forEach(System.out::println);
    }
}
