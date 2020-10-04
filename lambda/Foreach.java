import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {
        
        var produtos = Arrays
                .asList("Notebook Dell", "Notebook Lenovo", "Notebook Samsung");

        System.out.println("Sem Lambda:");
        for(var produto: produtos) {
            System.out.println(produto);
        }

        System.out.println("\nCom lambda:");
        produtos.forEach(nome -> System.out.println(nome));

        System.out.println("\nCom Method Refernce:");
        produtos.forEach(System.out::println);
    }
}
