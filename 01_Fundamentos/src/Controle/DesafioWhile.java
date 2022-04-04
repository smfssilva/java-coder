package Controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    double total = 0;
    double nota = 0;
    double media = 0;
    while (nota != -1) {
      System.out.print("Digite uma nota: ");
      nota = sc.nextDouble();
      if (nota >= 0 && nota <= 10) {
        contador++;
        total += nota;
        media = total / contador;
      }
    }
    System.out.printf("Media é %.2f\n", media);
    sc.close();
  }
}
