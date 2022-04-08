package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
  public static void main(String[] args) {
    Consumer<String> print = System.out::print;
    Consumer<Integer> println = System.out::println;

    Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");

    langs.forEach(print);

    String[] mainLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
    Stream.of(mainLangs).forEach(print);
    Arrays.stream(mainLangs).forEach(print);
    Arrays.stream(mainLangs, 1, 4).forEach(print);

    List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");

    outrasLangs.stream().forEach(System.out::print);
    outrasLangs.parallelStream().forEach(print);

    // Streams infinitas

    //Stream.generate(()-> "a").forEach(print);
    //Stream.iterate(0, n -> n + 1).forEach(println);
  }
}
