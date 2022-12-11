package jogador;

import java.util.Random;

import static partida.Partida.getNumero;

public class Pessoa extends Jogador {

    public Pessoa() {
        setNome();
        posicionaPecas();
    }

    public void fazJogada(Jogador computador) {
        int linha = getNumero("Informe a posição da linha: ");
        int coluna = getNumero("Informe a posição da coluna: ");
        computador.tabuleiro.gravaTabuleiro(linha, coluna);
    }

    public void posicionaPecas() {
        int contador = 1;
        String[][] grade = tabuleiro.getGrade();
        while (contador <= 10) {
            int linha = getNumero("Informe a posição da linha para posicionar o submarino: ");
            int coluna = getNumero("Informe a posição da coluna para posicionar o submarino: ");
            if (grade[linha][coluna].equals("   ")) {
                tabuleiro.setGrade(linha, coluna, " N ");
                tabuleiro.imprimeTabuleiro();
                contador++;
            } else {
                System.out.println("Posição já preenchida!");
            }
        }
    }
}
