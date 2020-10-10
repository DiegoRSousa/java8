import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    //Filtrar alunos com media acima de 7 e maior nota acima de 9

    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(new Aluno("Ana", 9.0, 9.7),
                                new Aluno("Silva", 7.8, 8.5),
                                new Aluno("Pedro", 8.5, 9),
                                new Aluno("Karla", 9, 10),
                                new Aluno("Rebeca", 6.9, 7.8));

        alunos.stream()
            .filter(a -> a.getMedia() >= 7)
            .filter(a -> a.getMaiorNota() >= 9)
            .map(a -> "Parabéns: " + a.getNome() + 
                      " você foi aprovado com média: " + a.getMedia() + 
                      " e sua maior nota foi: " + a.getMaiorNota())
            .forEach(System.out::println);;
    }
}