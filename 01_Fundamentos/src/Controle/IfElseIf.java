package Controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma nota: ");
    double nota = sc.nextDouble();

    if (nota < 0 || nota > 10) {
      System.out.println("Nota ínvalida");
    } else if (nota >=8.1) {
      System.out.println("Conceito A");
      System.out.println("Parabens");
    }else if (nota>=6.1){
      System.out.println("Conceito B");
    }else if (nota>=4.1){
      System.out.println("Conceito C");
    }else if (nota>=2.1){
      System.out.println("Conceito D");
    }else{
      System.out.println("Conceito E");
    }

    sc.close();
  }
}
