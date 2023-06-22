package br.com.ulife.modelos;

import java.util.Scanner;

public class Curso {

    //atributos da classe curso
    private String codigoCurso;
    private String nomeCurso;
    private int cargaHoraria;
    private String Descricao;

    //metodos da classe curso

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void cadastrarCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do curso: ");
        this.setCodigoCurso(scanner.nextLine());

        System.out.print("Digite o nome do curso: ");
        this.setNomeCurso(scanner.nextLine());

        System.out.println("Digite a carga horária do curso: ");
        this.setCargaHoraria(scanner.nextInt());

        System.out.println("Digite a descrição do curso: ");
        this.setDescricao(scanner.nextLine());

    }
}
