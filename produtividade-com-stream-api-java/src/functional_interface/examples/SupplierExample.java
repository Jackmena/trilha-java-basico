package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo
 */

public class SupplierExample {

    public static void main(String[] args) {

        // Usar Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";
        
        // Usar o Supplier para obter uma lista com 5 saudações

        //List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo!").limit(5).toList();

        // Imprimir as saudações geradas

        // lambda
         listaSaudacoes.forEach(s -> System.out.println(s));

        // method reference
        listaSaudacoes.forEach(System.out::println);
        
    }

}
