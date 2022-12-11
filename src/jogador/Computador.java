package jogador;

import java.util.Random;

public class Computador extends Jogador {

    public Computador() {
        posicionaPecas();
    }

    public void fazJogada(Jogador pessoa) {
        Random random = new Random();
        int linha = random.nextInt(0, 10);
        int coluna = random.nextInt(0, 10);
        pessoa.tabuleiro.gravaTabuleiro(linha, coluna);

        setQuantidadeAcertos(1);
    }

    public void posicionaPecas() {
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
        // APAGAR ESSAS DUAD LINHAS ABAIXO
        System.out.println("TABULEIRO DO COMPUTADOR");
        tabuleiro.imprimeTabuleiro();
    }

}
