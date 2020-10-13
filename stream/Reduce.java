import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {

    public static void main(String[] args) {
        System.out.println("Reduce1");
        reduce1();
        System.out.println("Reduce2");
        reduce2();
        System.out.println("Reduce3");        
        reduce3();
    }

    static void reduce1() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;
        Predicate<Integer> isPar = (v) -> v % 2 == 0;

        var total = nums.stream().reduce(soma).get();
        System.out.println(total);

        total = nums.stream().reduce(100, soma);
        System.out.println(total);

        nums.stream()
                .filter(isPar)
                .reduce(soma)
                .ifPresent(System.out::println);
    }

    static void reduce2() {
        var alunos = Arrays.asList(
                        new Aluno("Pedro", 9), 
                        new Aluno("Ana", 8), 
                        new Aluno("Silva", 7),
                        new Aluno("Joana", 6.7));
        Predicate<Aluno> aprovados = a -> a.getMedia() >= 7;
        Function<Aluno, Double> notas = a -> a.getMedia();
        BinaryOperator<Double> soma = (ac, v) -> ac + v;
        alunos.stream()
            .filter(aprovados)
            .map(notas)
            .reduce(soma)
            .ifPresent(System.out::println);
    }

    static void reduce3() {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Pedro", 9), 
            new Aluno("Ana", 8), 
            new Aluno("Silva", 7),
            new Aluno("Joana", 6.7));
        Predicate<Aluno> aprovados = a -> a.getMedia() >= 7;
        Function<Aluno, Double> notas = a -> a.getMedia();

        BiFunction<Media, Double, Media> adicionarNota = 
            (media, nota) -> media.adiciona(nota);

        BinaryOperator<Media> combinarMedia = 
            (m1, m2) -> Media.combinar(m1, m2);

        var media = alunos.stream()
            .filter(aprovados)
            .map(notas)
            .reduce(new Media(), adicionarNota, combinarMedia);

        System.out.println(media.getMedia());
    }
}
