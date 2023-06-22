package br.com.ulife.principal;

import br.com.ulife.atores.Aluno;
import br.com.ulife.atores.Professor;
import br.com.ulife.modelos.Curso;
import br.com.ulife.modelos.Sala;
import br.com.ulife.modelos.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//classe principal executável
public class Principal {
    public static void main(String[] args) {

        //array para armazenar as infos de alunos
        List<Aluno> listaAlunos = new ArrayList<>();
        List<Professor> listaProfessores = new ArrayList<>();
        List<Curso> listaCursos = new ArrayList<>();
        List<Sala> listaSalas = new ArrayList<>();
        List<Turma> listaTurmas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuarPrograma = true;

        //da as opções de ações disponíveis no sistema
        while(continuarPrograma) {
            System.out.println("Digite:");
            System.out.println("1 - Cadastrar novo Aluno");
            System.out.println("2 - Consultar Alunos cadastrados");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Consultar Professores cadastrados");
            System.out.println("5 - Cadastrar Curso");
            System.out.println("6 - Consultar Cursos cadastrados");
            System.out.println("7 - Cadastrar Sala");
            System.out.println("8 - Consultar Salas cadastradas");
            System.out.println("9 - Criar Turma");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

        //switch case para direcionar o usuário para a opção escolhida
       switch (opcao) {

           case 1:
               Aluno aluno = new Aluno();
               aluno.cadastrarAluno();
               listaAlunos.add(aluno);
               break;
           case 2:
               if (listaAlunos.isEmpty()) {
                   System.out.println("Nenhum aluno cadastrado.");
               } else {
                   System.out.println("Alunos cadastrados:");
                   for (Aluno a: listaAlunos) {
                       System.out.println("Nome: " +a.getNome());
                       System.out.println("Matricula: " +a.getMatricula());
                       System.out.println("CPF: " +a.getCpf());
                       System.out.println("Endereço: " +a.getEndereço());
                       System.out.println("Celular: " +a.getCelular());
                   }
               }
               break;
           case 3:
               Professor professor = new Professor();
               professor.cadastrarProfessor();
               listaProfessores.add(professor);
               break;
           case 4:
               if (listaProfessores.isEmpty()) {
                   System.out.println("Nenhum professor cadastrado.");
               } else {
                   System.out.println("Professores cadastrados:");
                   for (Professor p : listaProfessores) {
                       System.out.println("Nome: " +p.getNome());
                       System.out.println("Código de Funcionário: " +p.getCodigoFuncionario());
                       System.out.println("CPF: " +p.getCpf());
                       System.out.println("Endereço: " +p.getEndereço());
                       System.out.println("Celular: " +p.getCelular());
                   }
               }
               break;
           case 5:
               Curso curso = new Curso();
               curso.cadastrarCurso();
               listaCursos.add(curso);
               break;
           case 6:
                if (listaCursos.isEmpty()) {
                    System.out.println("Nenhum curso cadastrado.");
                } else {
                    System.out.println("Cursos cadastrados: ");
                    for (Curso c: listaCursos) {
                        System.out.println("Nome do curso: " + c.getNomeCurso());
                        System.out.println("Código do curso" + c.getCodigoCurso());
                        System.out.println("Carga horária: " + c.getCargaHoraria());
                        System.out.println("Descrição: " + c.getDescricao());
                    }
                }
                break;
           case 7:
               Sala sala = new Sala();
               sala.cadastrarSala();
               listaSalas.add(sala);
               break;
           case 8:
               if (listaSalas.isEmpty()) {
                   System.out.println("Nenhuma sala cadastrado.");
               } else {
                   System.out.println("Salas cadastradas:");
                   for (Sala s: listaSalas) {
                       System.out.println("Nome da sala: " + s.getNomeSala());
                       System.out.println("Local da sala: " + s.getLocal());
                       System.out.println("Capacidade da sala: " + s.getCapacidadeSala());
                   }
               }
               break;
           case 9:
               if (listaTurmas.isEmpty()) {
                   System.out.println("Nenhuma turma criada.");
               } else {
                   System.out.println("Distribuição de Alunos nas Turmas: ");
               }
           case 0:
               continuarPrograma = false;
               break;
           default:
               System.out.println("Opção inválida. Tente novamente.");
               break;

       }


    }

}}
