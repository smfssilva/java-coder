package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
  public static void main(String[] args) {
    List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

//    forma tradicional
    for (String nome: aprovados) {
      System.out.println(nome);
    }

//    lambida
    System.out.println("\nLambidas #01...");
    aprovados.forEach(x -> System.out.println(x+"!!!"));

    System.out.println("\nMetodo por referencia #01...");
    aprovados.forEach(System.out::println);

    System.out.println("\nLambidas #02...");
    aprovados.forEach(nome -> meuImprimir(nome));

    System.out.println("\nMetodo por referencia #02...");
    aprovados.forEach(Foreach::meuImprimir);

  }

  static void meuImprimir(String nome){
    System.out.println("Oi! meu nome é: "+nome);
  }
}
