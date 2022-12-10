package partida;

import jogador.Computador;
import jogador.Jogador;
import jogador.Pessoa;
import tabuleiro.Tabuleiro;

import java.util.Scanner;

public class Partida {
    public Pessoa pessoa;
    public Computador computador;
    public Tabuleiro tabuleiro;

    public Partida() {
        tabuleiro = new Tabuleiro();
        this.pessoa = new Pessoa();
        this.computador = new Computador();
        pessoa.setNome();
        computador.setNome();
    }

    public void iniciaTabuleiro() {
        tabuleiro.imprimeTabuleiro();
    }

    public void realizaJogada() {


//        tabuleiro.setGrade(linha, coluna, "x");
    }

    public void definePosicoes() {
        int condicao = 1;
        while (condicao <= 10) {
            int linha = getPosicao("Defina a posição da linha para submarino");
            int coluna = getPosicao("Defina a posição da coluna para submarino");
            tabuleiro.setGrade(linha, coluna, " N ");
            tabuleiro.imprimeTabuleiro();
            condicao++;
        }
    }

    public int getPosicao(String frase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(frase);
        return scanner.nextInt();
    }

}
