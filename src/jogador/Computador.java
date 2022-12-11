package jogador;

import java.util.Random;

public class Computador extends Jogador {

    public Computador() {
        posicionaPecas();
    }

    public void posicionaPecas() {
        int contador = 1;
        Random random = new Random();
        String[][] grade = tabuleiro.getGrade();
        while (contador <= 10) {
            int linha = random.nextInt(0, 10);
            int coluna = random.nextInt(0, 10);
            if (grade[linha][coluna] != "N") {
                tabuleiro.setGrade(linha, coluna, " N |");
                contador++;
            }
        }
        tabuleiro.imprimeTabuleiro();
    }

}
