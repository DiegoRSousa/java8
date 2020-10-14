import java.util.Arrays;

public class Outros {
    public static void main(String[] args) {
        var alunos = Arrays.asList(
            new Aluno("Pedro", 9), 
            new Aluno("Ana", 8), 
            new Aluno("Silva", 7),
            new Aluno("Joana", 6.7),
            new Aluno("Silva", 7),
            new Aluno("Joana", 6.7));

        System.out.println("distinct");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nskip/limit");
        alunos.stream()
            .skip(2)
            .limit(2)
            .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream().takeWhile(a-> a.getMedia() >= 7).forEach(System.out::println);
    }
}
