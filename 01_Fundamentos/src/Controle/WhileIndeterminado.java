package Controle;

import java.util.Locale;
import java.util.Scanner;

public class WhileIndeterminado {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite uma nota: ");
    double nota = sc.nextDouble();
    while (nota != 10){
      System.out.println("Continue tentando...");
      System.out.print("Digite uma nota: ");
      nota = sc.nextDouble();
      if (nota==10){
        System.out.println("Parabens!!!");
      }
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

    sc.close();
  }
}
