package arrays;

import java.util.Arrays;

public class Exercicio {
  public static void main(String[] args) {

    double[] notasAlunaA = new double[4];
    notasAlunaA[0] = 7.9;
    notasAlunaA[1] = 8;
    notasAlunaA[2] = 6.7;
    notasAlunaA[3] = 9.7;

    System.out.println(Arrays.toString(notasAlunaA));

    double total = 0;
    for (int i = 0; i < notasAlunaA.length; i++) {
      total += notasAlunaA[i];
    }
    System.out.println(total/notasAlunaA.length);

    double[] notasAlunoB = {6.9,8.9,5.5,10};

    total = 0;
    for (int i = 0; i < notasAlunoB.length; i++) {
      total += notasAlunoB[i];
    }
    System.out.println(total/notasAlunoB.length);
  }
}
