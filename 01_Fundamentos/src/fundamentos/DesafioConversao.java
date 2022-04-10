package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primerio salario: ");
    String s1 = sc.nextLine().replace(",", ".");
    System.out.print("Digite o segundo salario: ");
    String s2 = sc.nextLine().replace(",", ".");
    System.out.print("Digite o terceiro salario: ");
    String s3 = sc.nextLine().replace(",", ".");;

    double soma = Double.parseDouble(s1) +
            Double.parseDouble(s2) +
            Double.parseDouble(s3);
    System.out.printf("Soma é igual a: %.2f\n", soma);
    System.out.printf("Média é igual a: %.2f\n", soma / 3);




    sc.close();


  }
}
