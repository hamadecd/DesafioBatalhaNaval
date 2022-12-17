package jogador;

import java.util.Random;
import java.util.Scanner;

import static partida.Partida.getNumero;

public class Pessoa extends Jogador {

    public Pessoa() {
        setNome();
        comoPosicionarPecas();
    }

    private void comoPosicionarPecas() {
        Scanner scanner = new Scanner(System.in);
        String frase = (getNome() + ", deseja escolher onde posicionar as peças, ou fazer de maneira aleatória pelo computador?\n" +
                "0 - ESCOLHER\n" +
                "1 - ALEATÓRIA");
        int escolha = getNumero(frase);
        if (escolha == 0) {
            posicionaPecas();
        } else if (escolha == 1) {
            posicionaPecasAutomaticamente();
        }
        imprimeTabuleiro();
    }

    public void fazJogada(Jogador computador) {
        int linha = getNumero("Informe a posição da linha: ");
        int coluna = getNumero("Informe a posição da coluna: ");
        int ponto = tabuleiro.gravaTabuleiro(linha, coluna, computador.tabuleiro.getGrade());
        if (ponto > 0) {
            setQuantidadeAcertos(getQuantidadeAcertos()+1);
        } else if (ponto == -1) {
            System.out.println("Posição já preenchida.");
            fazJogada(computador);
        }
    }

    public void posicionaPecas() {
        int contador = 1;
        String[][] grade = tabuleiro.getGrade();
        while (contador <= 10) {
            int linha = getNumero("Informe a posição da linha para posicionar o submarino: ");
            int coluna = getNumero("Informe a posição da coluna para posicionar o submarino: ");
            if (grade[linha][coluna].equals("   ")) {
                tabuleiro.setGrade(linha, coluna);
                tabuleiro.imprimeTabuleiro();
                contador++;
            } else {
                System.out.println("Posição já preenchida!");
            }
        }
    }
}
