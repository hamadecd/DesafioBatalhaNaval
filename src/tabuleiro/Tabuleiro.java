package tabuleiro;

import jogador.Computador;
import jogador.Jogador;
import jogador.Pessoa;

import javax.print.attribute.standard.MediaSize;

public class Tabuleiro {

    private String[][] grade;
    private final String CERTEIRO = " * ";
    private final String AGUA = " - ";
    private final String CERTEIRO_NAVIO = " X ";
    private final String AGUA_NAVIO = " n ";
    private final String VAZIO = "   ";
    private final String NAVIO = " N ";
    private String cabecalho = "---------------------------------------------\n" +
            "                  JOGADOR                    \n" +
            "---------------------------------------------\n" +
            "|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n" +
            "---------------------------------------------";
    public final String vetorColuna[] = {" A ", " B ", " C ", " D ", " E ", " F ", " G ", " H ", " I ", " J "};

    public Tabuleiro() {
        grade = new String[10][10];
        preencheTabuleiro();
    }

    public void imprimeTabuleiro() {
        System.out.println(cabecalho);
        for (int linha = 0; linha < grade.length; linha++) {
            System.out.print("|"+vetorColuna[linha]+"|");
            for (int colunha = 0; colunha < grade[linha].length; colunha++) {
                System.out.print(grade[linha][colunha]+"|");
            }
            System.out.println("\n---------------------------------------------");
        }
    }

    public void preencheTabuleiro() {
        for (int linha = 0; linha < grade.length; linha++) {
            for (int colunha = 0; colunha < grade[linha].length; colunha++) {
                grade[linha][colunha] = VAZIO;
            }
        }
    }

    public int gravaTabuleiro(int linha, int coluna, String[][] gradeOponente) {

        if (grade[linha][coluna].equals(NAVIO) || grade[linha][coluna].equals(VAZIO)) {
            if (gradeOponente[linha][coluna].equals(VAZIO) || gradeOponente[linha][coluna].equals(CERTEIRO) || gradeOponente[linha][coluna].equals(AGUA)) {
                if (grade[linha][coluna].equals(NAVIO)) {
                    grade[linha][coluna] = AGUA_NAVIO;
                } else {
                    grade[linha][coluna] = AGUA;
                }
                return 0;
            } else if (gradeOponente[linha][coluna].equals(NAVIO) || gradeOponente[linha][coluna].equals(CERTEIRO_NAVIO) || gradeOponente[linha][coluna].equals(AGUA_NAVIO)) {
                if (grade[linha][coluna].equals(NAVIO)) {
                    grade[linha][coluna] = CERTEIRO_NAVIO;
                } else {
                    grade[linha][coluna] = CERTEIRO;
                }
                return 1;
            }
        }
        return -1;
    }

    public void setGrade(int linha, int coluna) {
        this.grade[linha][coluna] = NAVIO;
    }

    public String[][] getGrade() {
        return grade;
    }

}













