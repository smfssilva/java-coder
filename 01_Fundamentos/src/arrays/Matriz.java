package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a quantidade de alunos: ");
    int qtdAlunos = sc.nextInt();
    System.out.print("Informe a quantidade de notas: ");
    int qtdNotas = sc.nextInt();
    double[][] notas = new double[qtdAlunos][qtdNotas];

    double total = 0;
    for (int i = 0; i < notas.length; i++) {
      for (int j = 0; j < notas[i].length; j++) {
        System.out.printf("Informe a nota %d do aluno(a) %d: ", j+1, i+1);
        notas[i][j] = sc.nextDouble();
        total+=notas[i][j];
      }
    }

    double media = total / (qtdAlunos * qtdNotas);
    System.out.printf("A media da turma é %.2f", media);

    System.out.println();


    sc.close();
  }
}
