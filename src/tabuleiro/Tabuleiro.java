package tabuleiro;

import jogador.Computador;
import jogador.Jogador;
import jogador.Pessoa;

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
        if (grade[linha][coluna].equals(VAZIO)) {
            grade[linha][coluna] = AGUA;
            if (gradeOponente[linha][coluna].equals(NAVIO)) {
                gradeOponente[linha][coluna] = AGUA_NAVIO;
            }
        } else if (grade[linha][coluna].equals(NAVIO) || grade[linha][coluna].equals(AGUA_NAVIO) || grade[linha][coluna].equals(CERTEIRO_NAVIO)) {
            grade[linha][coluna] = CERTEIRO;
            if (gradeOponente[linha][coluna].equals(NAVIO)) {
                gradeOponente[linha][coluna] = CERTEIRO_NAVIO;
            }
            return 1;
        } else if (!grade[linha][coluna].equals(VAZIO)) {
            System.out.println("Posição já preenchida.");
            return -1;
        }
        return 0;
    }

    public void setGrade(int linha, int coluna, String caractere) {
        this.grade[linha][coluna] = caractere;
    }

    public String[][] getGrade() {
        return grade;
    }

}













