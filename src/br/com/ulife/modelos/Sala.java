package br.com.ulife.modelos;

import java.util.Scanner;

public class Sala {

    //atributos da classe salas

    private String nomeSala;
    private String local;
    private int capacidadeSala;

    //metodos da classe sala

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidadeSala() {
        return capacidadeSala;
    }

    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

    public void cadastrarSala() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da sala: ");
        this.setNomeSala(scanner.nextLine());

        System.out.print("Digite o local da sala: ");
        this.setLocal(scanner.nextLine());

        System.out.print("Digite o capacidade da sala: ");
        this.setCapacidadeSala(scanner.nextInt());

    }
}
