package jogador;

import static partida.Partida.getNumero;

public class Pessoa extends Jogador {

    public Pessoa() {
        posicionaPecas();
    }

    public void posicionaPecas() {
        int contador = 1;
        String[][] grade = tabuleiro.getGrade();
        while (contador <= 10) {
            int linha = getNumero("Informe a posição da linha para posicionar o submarino: ");
            int coluna = getNumero("Informe a posição da coluna para posicionar o submarino: ");
            if (grade[linha][coluna] != "N") {
                tabuleiro.setGrade(linha, coluna, " N |");
                tabuleiro.imprimeTabuleiro();
                contador++;
            } else {
                System.out.println("Posição já preenchida!");
            }
        }
    }
}
