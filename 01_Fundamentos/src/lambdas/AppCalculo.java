package lambdas;

import java.util.function.BinaryOperator;

public class AppCalculo {
  public static void main(String[] args) {

    BinaryOperator<Double> calc = (a, b) -> a / b;

    Calculo soma = new Soma();
    Calculo mult = new Multiplicar();

    System.out.println(soma.executar(2, 3));
    System.out.println(mult.executar(2, 3));

    // lambda
    Calculo x = Double::sum;
    Calculo y = (a, b) -> {
      return a * b;
    };
    Calculo c = (a, b) -> a * b;

    Calculo s = Calculo::subtrair;

    System.out.println(x.executar(3, 9));
    System.out.println(y.executar(3, 9));
    System.out.println(c.executar(10, 9));
    System.out.println(s.executar(15, 10));
    System.out.println(calc.apply(35.0, 3.0));


  }
}
