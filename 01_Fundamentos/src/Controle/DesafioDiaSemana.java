package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um dia da semana: ");
    String dia = sc.next();
    System.out.println();
    if (dia.toLowerCase().equals("domingo")){
      System.out.println("Dia 1");
    }else if (dia.toLowerCase().equals("segunda")){
      System.out.println("Dia 2");
    }else if (dia.toLowerCase().equals("terça")){
      System.out.println("Dia 3");
    }else if (dia.toLowerCase().equals("quarta")){
      System.out.println("Dia 4");
    }else if (dia.toLowerCase().equals("quinta")){
      System.out.println("Dia 5");
    }else if (dia.toLowerCase().equals("sexta")){
      System.out.println("Dia 6");
    }else if (dia.toLowerCase().equals("sábado")){
      System.out.println("Dia 7");
    }

    sc.close();
  }
}
