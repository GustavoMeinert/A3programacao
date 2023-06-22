package br.com.ulife.atores;

import java.util.Scanner;

// a classe aluno se estende da classe pessoa
public class Aluno extends Pessoa{

    //atributos da classe aluno
    private String matricula;

    //metodos da classe aluno

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        this.setMatricula(scanner.nextLine());

        System.out.print("Digite o nome do aluno: ");
        this.setNome(scanner.nextLine());

        System.out.print("Digite o CPF do aluno: ");
        this.setCpf(scanner.nextLine());

        System.out.print("Digite o endereço do aluno: ");
        this.setEndereço(scanner.nextLine());

        System.out.print("Digite o email do aluno: ");
        this.setEmail(scanner.nextLine());

        System.out.print("Digite o celular do aluno: ");
        this.setCelular(scanner.nextLine());

    }

}
