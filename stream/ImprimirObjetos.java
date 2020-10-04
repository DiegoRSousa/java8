import java.util.Arrays;
import java.util.List;

public class ImprimirObjetos {
    public static void main(String[] args) {
        List<String> pessoas = Arrays.asList("Ana", "Pedro", "Silva", "Gariela");

        System.out.println("Foreach...");
        for(String pessoa : pessoas) {
            System.out.println(pessoa);

        }

        System.out.println("\nStream...");
        pessoas.stream().forEach(System.out::println);
    }
}