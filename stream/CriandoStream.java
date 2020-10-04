import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> linguagens = Stream.of("Java ", "C# ", "Javascript\n");
        linguagens.forEach(print);

        String[] maisLinguagens = {"Go ", "C++ ", "Rust\n"};
        Stream.of(maisLinguagens).forEach(System.out::print);

        Arrays.stream(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens, 0, 2).forEach(print);

        List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Lua", "Kotlin", "VB\n");
        outrasLinguagens.stream().forEach(print);

        outrasLinguagens.parallelStream().forEach(print);


    }
}
