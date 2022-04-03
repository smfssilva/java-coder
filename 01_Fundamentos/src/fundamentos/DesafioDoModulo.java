package fundamentos;

import java.util.Scanner;

public class DesafioDoModulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double n1 = sc.nextDouble();
    System.out.print("Digite a operação: ");
    String op = "" + sc.next().charAt(0);
    System.out.print("Digite o segundo número: ");
    double n2 = sc.nextDouble();
    double resultado;
    resultado = op.equals("+") ? n1 + n2 : 0;
    resultado = op.equals("-") ? n1 - n2 : resultado;
    resultado = op.equals("*") ? n1 * n2 : resultado;
    resultado = op.equals("/") ? n1 / n2 : resultado;
    resultado = op.equals("%") ? n1 % n2 : resultado;
    System.out.printf("%.2f %s %.2f = %.2f\n", n1, op, n2, resultado);

    sc.close();
  }
}
