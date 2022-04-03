package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um dia da semana: ");
    String dia = sc.next();
    System.out.println();
    if (dia.equalsIgnoreCase("domingo")){
      System.out.println("Dia 1");
    }else if (dia.equalsIgnoreCase("segunda")){
      System.out.println("Dia 2");
    }else if (dia.equalsIgnoreCase("terça")){
      System.out.println("Dia 3");
    }else if (dia.equalsIgnoreCase("quarta")){
      System.out.println("Dia 4");
    }else if (dia.equalsIgnoreCase("quinta")){
      System.out.println("Dia 5");
    }else if (dia.equalsIgnoreCase("sexta")){
      System.out.println("Dia 6");
    }else if (dia.equalsIgnoreCase("sábado")){
      System.out.println("Dia 7");
    }else{
      System.out.println("Dia ínvalido");
    }

    sc.close();
  }
}
