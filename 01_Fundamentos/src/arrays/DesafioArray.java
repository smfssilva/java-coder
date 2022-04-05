package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println();

    System.out.print("Informe a quantidade de notas: ");
    int n = sc.nextInt();
    double[] notas = new double[n];
    for (int i = 0; i < notas.length; i++) {
      System.out.printf("Informe a nota #%d: ", i + 1);
      notas[i] = sc.nextDouble();
    }

    double total = 0;
    for (double nota : notas) {
      total += nota;
    }

    double media = total / notas.length;
    System.out.printf("A média é: %.2f", media);
    System.out.println();
    sc.close();
  }
}
