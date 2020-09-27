## Interfaces Funcionais

São interfaces que possuem um único método abstrato.

```
@FunctionalInterface
interface Calculo {
    double executar(int a, int b);
}
```

Podemos criar uma função anônima usando lambda associando a uma interface funcional, não precisamos criar uma classe e método para implementar a interface.

```
Calculo calculo = (a, b) -> a + b;
System.out.println(calculo.executar(1, 3));
```

Na versão 8 do Java foram disponibilizadas as interfaces funcionais, já temos uma interface com a funcionalidade que criamos acima.

```
BinaryOperator<Integer> operacao = (a, b)  -> a * b;
System.out.println(operacao.apply(4, 5));
```

[Documentação](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) para consulta desta e muitas outras interfaces funcionais.

## Foreach

A partir do Java 8 em todas as coleções temos acesso ao foreach que facilita iterar nelas.

A seguir temos uma lista de produtos:

```
var produtos = Arrays.asList("Notebook Dell", "Notebook Lenovo", "Notebook Samsung");
```

Para imprimirmos o nome do produtos antes do Java 8 precisamos usar um for tradicional.

```
for(var produto: produtos) {
    System.out.println(produto);
}
```

Podemos fazer essa interação usando o foreach de forma mais concisa.

```
produtos.forEach(nome -> System.out.println(nome));
```

É possível simplificar ainda mais o código usando menos símbolos e para isso temos Method References.

```
produtos.forEach(System.out::println);
```