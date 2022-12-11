package tabuleiro;

public class Tabuleiro {

    private String[][] grade;
    private final String CERTEIRO = " * ";
    private final String AGUA = " - ";
    private final String CERTEIRO_NAVIO = " X ";
    private final String AGUA_NAVIO = " n ";
    private final String NAVIO = " N ";
    private String cabecalho = "---------------------------------------------\n" +
            "                  JOGADOR                    \n" +
            "---------------------------------------------\n" +
            "|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n" +
            "---------------------------------------------";
    public final String vetorColuna[] = {"| A |", "| B |", "| C |", "| D |", "| E |", "| F |", "| G |", "| H |", "| I |", "| J |"};

    public Tabuleiro() {
        grade = new String[10][10];
        preencheTabuleiro();
    }

    public void imprimeTabuleiro() {
        System.out.println(cabecalho);
        for (int linha = 0; linha < grade.length; linha++) {
            System.out.print(vetorColuna[linha]);
            for (int colunha = 0; colunha < grade[linha].length; colunha++) {
                System.out.print(grade[linha][colunha]+"|");
            }
            System.out.println("\n---------------------------------------------");
        }
    }

    public void preencheTabuleiro() {
        for (int linha = 0; linha < grade.length; linha++) {
            for (int colunha = 0; colunha < grade[linha].length; colunha++) {
                grade[linha][colunha] = "   ";
            }
        }
    }

    public void gravaTabuleiro(int linha, int coluna) {
        if (grade[linha][coluna].equals("   ")) {
            grade[linha][coluna] = AGUA;
        } else if (grade[linha][coluna].equals(NAVIO)) {
            grade[linha][coluna] = CERTEIRO_NAVIO;
        } else {

        }

//        String alvo = grade[linha][coluna];
//        switch (alvo) {
//            case NAVIO :
//                grade[linha][coluna] = CERTEIRO_NAVIO;
//                break;
//            case CERTEIRO:
//                System.out.println();
//                break;
//        }
    }

    public void setGrade(int linha, int coluna, String caractere) {
        this.grade[linha][coluna] = caractere;
    }

    public String[][] getGrade() {
        return grade;
    }

}













