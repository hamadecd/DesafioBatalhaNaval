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

    public void posicionaPecas() {

    }

    public void fazJogada(Jogador jogador) {
        int linha = getNumero("Informe a posição da linha: ");
        int coluna = getNumero("Informe a posição da coluna: ");
        jogador.tabuleiro.setGrade(linha, coluna, "");

    }
    public void setNome() {
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
