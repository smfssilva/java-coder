package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
  public static void main(String[] args) {
    List<String> aprovados = Arrays.asList("Sivanilson", "Maciel", "Ferreira");

    for(String nome: aprovados){
      System.out.println(nome);
    }

    System.out.println("\nUsando Iterator...");
    Iterator<String> i = aprovados.iterator();
    while (i.hasNext()){
      System.out.println(i.next());
    }

    System.out.println("\nUsando Stream...");
    Stream<String> stream = aprovados.stream();
    stream.forEach(System.out::println);
    System.out.println();
    aprovados.stream().forEach(System.out::println);
  }
}
