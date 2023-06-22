package br.com.ulife.atores;

import java.util.Scanner;

//a classe professor se estende da classe pessoa
public class Professor extends Pessoa{

    //atributos da classe professor
    private String codigoFuncionario;

    //metodos da classe professor

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public void cadastrarProfessor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de funcionário professor: ");
        this.setCodigoFuncionario(scanner.nextLine());

        System.out.print("Digite o nome do professor: ");
        this.setNome(scanner.nextLine());

        System.out.print("Digite o CPF do professor: ");
        this.setCpf(scanner.nextLine());

        System.out.print("Digite o endereço do professor: ");
        this.setEndereço(scanner.nextLine());

        System.out.print("Digite o email do professor: ");
        this.setEmail(scanner.nextLine());

        System.out.print("Digite o celular do profesor: ");
        this.setCelular(scanner.nextLine());

    }

}

