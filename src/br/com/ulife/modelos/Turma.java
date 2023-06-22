package br.com.ulife.modelos;

import br.com.ulife.atores.Aluno;
import br.com.ulife.atores.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Curso curso;
    private Professor professor;
    private Sala sala;
    private List<Aluno> alunos;

    public Turma(Curso curso, Professor professor, Sala sala) {
        this.curso = curso;
        this.professor = professor;
        this.sala = sala;
        this.alunos = new ArrayList<>();
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }


}
