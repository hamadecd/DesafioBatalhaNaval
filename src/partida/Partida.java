package partida;

import jogador.Computador;
import jogador.Jogador;
import tabuleiro.Tabuleiro;

import java.util.Scanner;

public class Partida {
    public Jogador jogador;
    public Computador computador;
    public Tabuleiro tabuleiro = new Tabuleiro();

    public void iniciaTabuleiro() {
        tabuleiro.imprimeTabuleiro();
    }

    public void jogada(int linha, int coluna) {
    }

//    public void nomeJogador() {
//        jogador = new Jogador();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Jogador, informe seu nome: ");
//        scanner.nextLine(jogador.setNome());
//    }

}
