package fundamentos.operadores;

public class DesafioAritmetico {

  public static void main(String[] args) {

    double numA = Math.pow(6 * (3 + 2), 2);
    double denA = 3 * 2;
    double resA = numA / denA;

    double numB = Math.pow((1 - 5) * (2 - 7), 2) / 2;
    double denB = 2;
    double resB = numB / denB;

    double resultado = Math.pow(resA - resB, 3) / Math.pow(10, 3);


    System.out.println("O resultado é: " + resultado);

  }
}
