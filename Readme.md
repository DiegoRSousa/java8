## Interface Funcional

São interaces no qual possuem um único método abstrato

```
@FunctionalInterface
interface Calculo {
    double executar(int a, int b);
}
```

Podemos criar uma função anonima usando lambda associando a uma interface funcional, não precisamos criar uma classe e método para implementar a interface

```
Calculo calc = (a, b) -> a + b;
System.out.println(calc.executar(1, 3));
```

Na versão 8 do java foram disponibilizadas as interfaces funcionais, já temos uma interface com a funcionalidade da que criamos acima.

```
BinaryOperator<Integer> calc2 = (a, b)  -> (a * b);
System.out.println(calc2.apply(4, 5));
```

[Documentação](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) para consulta desta e muitas outras interfaces funcionais.