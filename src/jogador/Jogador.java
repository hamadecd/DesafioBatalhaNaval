package jogador;

import tabuleiro.Tabuleiro;

import java.util.Random;
import java.util.Scanner;

import static partida.Partida.getNumero;

public class Jogador {
    private String nome;
    private int quantidadeAcertos;
    public Tabuleiro tabuleiro = new Tabuleiro();

    public Jogador() {
    }

    protected void posicionaPecasAutomaticamente() {
        int contador = 1;
        Random random = new Random();
        String[][] grade = tabuleiro.getGrade();
        while (contador <= 10) {
            int linha = random.nextInt(0, 10);
            int coluna = random.nextInt(0, 10);
            if (grade[linha][coluna].equals("   ")) {
                tabuleiro.setGrade(linha, coluna, " N ");
                contador++;
            }
        }
    };

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
