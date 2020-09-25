import java.util.function.BinaryOperator;

@FunctionalInterface
interface Calculo {
    double executar(int a, int b);
}

public class InterfaceFuncional {
    public static void main(String args[]) {
        Calculo calc = (a, b) -> a + b;
        System.out.println(calc.executar(1, 3));

        BinaryOperator<Integer> calc2 = (a, b)  -> (a * b);
        System.out.println(calc2.apply(4, 5));
    }
}