package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

  String nome;
  List<Curso> cursos = new ArrayList<>();

  public Aluno(String nome) {
    this.nome = nome;
  }

  void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
  }
}
