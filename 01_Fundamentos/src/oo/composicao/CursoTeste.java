package oo.composicao;

public class CursoTeste {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("João");
    Aluno a2 = new Aluno("Maria");
    Aluno a3 = new Aluno("Pedro");

    Curso c1 = new Curso("Java Completo");
    Curso c2 = new Curso("Web 2023");
    Curso c3 = new Curso("React Native");

    c1.adicionarAluno(a1);
    c1.adicionarAluno(a2);

    c2.adicionarAluno(a1);
    c2.adicionarAluno(a3);

    a1.adicionarCurso(c1);
    a2.adicionarCurso(c3);
    a3.adicionarCurso(c3);

    for (Aluno aluno : c1.alunos) {
      System.out.println(aluno.nome);
    }

    System.out.println();
    for (Curso c : a1.cursos) {
      System.out.println(c.nome);
    }
  }
}
