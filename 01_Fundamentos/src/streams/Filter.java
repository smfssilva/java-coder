package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Sivanilson", 8.9);
    Aluno a2 = new Aluno("Maciel", 6.1);
    Aluno a3 = new Aluno("Ferreira", 6.9);
    Aluno a4 = new Aluno("Thawanna", 9.9);
    Aluno a5 = new Aluno("Andressa", 9.9);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

    Predicate<Aluno> aprovado = a -> a.nota >= 7;
    Function<Aluno, String> resultado = a -> "Parabens " + a.nome + " você foi aprovado(a)";
    Consumer<String> imprimir = System.out::println;

    alunos.stream()
      .filter(aprovado)
      .map(resultado)
      .forEach(imprimir);

  }
}
