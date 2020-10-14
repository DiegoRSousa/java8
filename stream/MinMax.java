import java.util.Arrays;
import java.util.Comparator;

public class MinMax {
    public static void main(String[] args) {
        var alunos = Arrays.asList(
            new Aluno("Pedro", 9), 
            new Aluno("Ana", 8), 
            new Aluno("Silva", 7),
            new Aluno("Joana", 6.7));

        Comparator<Aluno> notas = (a1, a2) -> {
            if(a1.getMedia() > a2.getMedia()) return 1;
            if(a2.getMedia() > a1.getMedia()) return -1;
            return 0;
        };
        System.out.println(alunos.stream().max(notas).get());
        System.out.println(alunos.stream().min(notas).get());
    }
}
