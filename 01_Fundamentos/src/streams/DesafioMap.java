package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

//    Function<Integer, String> numParaBin = Integer::toBinaryString;

    UnaryOperator<String> reverter = y -> new StringBuilder(y).reverse().toString();

    Function<String, Integer> converter = z -> Integer.parseInt(z,2);


    nums.stream()
      .map(Integer::toBinaryString)
      .map(reverter)
      .map(converter)
      .forEach(System.out::println);

    /**
     * 1. Número para string binário...6 => "110"
     * 2. Reverter a string..."110" => "011"
     * 3. converter de volta para inteiro => "011" => 3
     */
  }
}
