package jogador;

import tabuleiro.Tabuleiro;

import java.util.Scanner;

import static partida.Partida.getNumero;

public class Jogador {
    private String nome;
    private int quantidadeAcertos;
    protected Tabuleiro tabuleiro;

    public Jogador() {
        tabuleiro = new Tabuleiro();
    }

    protected String[][] getGradeJogador() {
        return tabuleiro.getGrade();
    }

    public void posicionaPecas() {}

    public void fazJogada(Jogador jogador) {}

    protected void setNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador, informe seu nome: ");
        this.nome = scanner.nextLine();
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeAcertos() {
        return quantidadeAcertos;
    }

    public void setQuantidadeAcertos(int quantidadeAcertos) {
        this.quantidadeAcertos = quantidadeAcertos;
    }

    public void imprimeTabuleiro() {
        tabuleiro.imprimeTabuleiro();
    }
}
