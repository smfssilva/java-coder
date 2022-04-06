package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  String nome;
  List<Aluno> alunos = new ArrayList<>();

  public Curso(String nome) {
    this.nome = nome;
  }

  void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }
}
