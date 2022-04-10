package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
  public static void main(String[] args) {

    Consumer<String> print = System.out::print;

    List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

    //Sem metodo referencia
    marcas.stream().map(m -> m.toUpperCase()).forEach(print);
    // Com metodo referencia
    marcas.stream().map(String::toUpperCase).forEach(print);

    UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    UnaryOperator<String> primeriaLetra = n -> n.charAt(0)+"";
    UnaryOperator<String> grito = n -> n + "!!!";

    String result = maiuscula.andThen(primeriaLetra).andThen(grito).apply(marcas.get(0));
    System.out.println(result);

    //    Teste

    // usando streams
    marcas.stream()
            .map(maiuscula)
            .map(primeriaLetra)
            .map(grito)
            .forEach(print);


  }
}
