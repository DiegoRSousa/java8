import java.util.function.BinaryOperator;

@FunctionalInterface
interface Calculo {
    double executar(int a, int b);
}

public class InterfaceFuncional {
    public static void main(String args[]) {
        Calculo calculo = (a, b) -> a + b;
        System.out.println(calculo.executar(1, 3));

        BinaryOperator<Integer> operacao = (a, b)  -> a * b;
        System.out.println(operacao.apply(4, 5));
    }
}