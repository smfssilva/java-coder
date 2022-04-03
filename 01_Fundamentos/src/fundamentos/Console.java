package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Console {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    System.out.print("Bom");
    System.out.print(" dia!\n");

    System.out.println("Bom");
    System.out.println("dia!");

    System.out.printf("Megasena: %d %d %d %d %d %d", 1,2,3,4,5,6);
    System.out.printf("Salario: %.1f\n", 12345.6778);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("Nome: "+nome);

    sc.close();
  }
}
