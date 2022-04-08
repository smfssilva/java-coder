package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
  public static void main(String[] args) {

    BinaryOperator<Double> media =
            (n1, n2) -> (n1 + n2) / 2;

    BiFunction<Double, Double, String> resultado =
            (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Recuperação";

    System.out.println(resultado.apply(6.8, 5.7));
    System.out.println(media.apply(6.8, 5.7));
  }
}
