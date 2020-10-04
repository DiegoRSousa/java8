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

## Predicate

Predicate é uma interface funcional que recebe um argumento genérico e retorna um boolean.

```
Produto notebookSamsung = new Produto("Notebook Samsung", 3000);
Predicate<Produto> isCaro = produto -> produto.getPreco() > 2500;
System.out.println(isCaro.test(notebookSamsung));
```

## Consumer

Consumer é uma interface funcional que recebe um argumento genérico faz um processamento e não retorna nada.

```
Consumer<Produto> imprimirNome = p -> System.out.println(p.getDescricao() + " - " + p.getPreco());
Produto produto = new Produto("Refrigerante", 3.75);
imprimirNome.accept(produto);
```

## Function

Interface que representa uma função que aceita um argumento e produz um resultado genérico.

```
Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
System.out.println(parOuImpar.apply(10));
```

## Composição de funções

Através da composição de funções podemos desenvolver funções pequenas com responsabilidades limitadas
e reaproveita-las.

```
Function<String, String> resultado = valor -> "O resultado final é: " + valor;
String resultadoFinal = parOuImpar.andThen(resultado).apply(3);
System.out.println(resultadoFinal);
```

## Supplier

É uma interface funcional e pode, portanto, ser usada como destino de atribuição para uma expressão lambda.

```
Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Silva", "Pedro");
System.out.println(lista.get());
```

## UnaryOperator

É uma interface funcional que seu tipo de parâmetro de entrada é igual ao de retorno, recebe um valor genérico faz o processamento e retorna o resultado.

```
UnaryOperator<Integer> maisDois = n -> n + 2;
UnaryOperator<Integer> vezesDois = n -> n * 2;
UnaryOperator<Integer> aoQuadrado = n -> n * n;
var resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
System.out.println(resultado);
```

### Binary Operator

Representa uma operação sobre dois operandos do mesmo tipo, produz o resultado do mesmo tipo dos operandos.

```
BinaryOperator<Double> media1 = (n1, n2) -> (n1 + n2) / 2;
System.out.println(media1.apply(5.0, 3.0));
```

### Stream

Representa uma sequência de elementos e oferece suporte a diferente tipos de operações estilo funcional para realizar cálculos sobre esses elementos.

```
List<String> pessoas = Arrays.asList("Ana", "Pedro", "Silva", "Gariela");
pessoas.stream().forEach(System.out::println);
```