import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(new Aluno("Ana", 9.0),
                                new Aluno("Silva", 7.8),
                                new Aluno("Pedro", 8.5),
                                new Aluno("Karla", 9),
                                new Aluno("Rebeca", 6.9));
        
        alunos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> "Parabéns: " + a.getNome() + " você foi aprovado com nota: " + a.getNota())
                .forEach(System.out::println);
    }
}
