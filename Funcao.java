import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = 
            numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(10));

        Function<String, String> resultado =
            valor -> "O resultado final é: " + valor;
        String resultadoFinal = parOuImpar.andThen(resultado).apply(3);
        System.out.println(resultadoFinal);

    }
}