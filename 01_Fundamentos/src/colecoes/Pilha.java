package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
  public static void main(String[] args) {
    Deque<String> livros = new ArrayDeque<>();

    livros.add("O pequeno principe");
    livros.add("Cinquenta tons de cinza");
    livros.add("Chapeuzinho vermelho");
    livros.add("Don Quixote");

    System.out.println(livros.remove());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.size());
    System.out.println(livros.isEmpty());

  }
}
