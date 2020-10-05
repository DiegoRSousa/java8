import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {

        Stream<String> linguagens = Stream.of("Java ", "C# ", "Javascript\n");
        linguagens.map(l -> l.toUpperCase()).forEach(Util.print);

        List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Lua", "Kotlin", "VB\n");
        System.out.println("\nUsando composição");
        outrasLinguagens.stream().map(Util.maisuculo)
            .map(Util.primeiraLetra)
            .map(Util::enfanse)
            .forEach(Util.print);
    }
}
