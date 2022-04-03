package Controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe a média: ");
    double nota = sc.nextDouble();

    if (nota >= 7) {
      System.out.println("Aprovado");
      System.out.println("Parabens!");
    }

    if (nota < 7 && nota >= 4.5) {
      System.out.println("Recuperação");
    }

    if (nota < 4.5 && nota >= 0) {
      System.out.println("Reprovado");
    }

    sc.close();
  }
}
