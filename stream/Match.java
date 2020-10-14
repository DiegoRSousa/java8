import java.util.Arrays;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        var alunos = Arrays.asList(
            new Aluno("Pedro", 9), 
            new Aluno("Ana", 8), 
            new Aluno("Silva", 7),
            new Aluno("Joana", 6.7));
        Predicate<Aluno> aprovados = a -> a.getMedia() >= 7;

        System.out.println(alunos.stream().allMatch(aprovados));
        System.out.println(alunos.stream().anyMatch(aprovados));
        System.out.println(alunos.stream().noneMatch(aprovados));
        
    }
}
