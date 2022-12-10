package jogador;

import java.util.Scanner;

public class Jogador {
    private String nome;
    private int quantidadeAcertos;
    public void setNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador, informe seu nome: ");
        this.nome = scanner.nextLine();
    }

    public String getNome() {
        return this.nome;
    }

}
