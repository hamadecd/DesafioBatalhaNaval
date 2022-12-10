package tabuleiro;

public class Tabuleiro {
    private final int LINHA = 10;
    private final int COLUNA = 10;
    private String[][] tabuleiro = new String[LINHA][COLUNA];
    private final String CERTEIRO = "*";
    private final String AGUA = "-";
    private final String CERTEIRO_NAVIO = "X";
    private final String AGUA_NAVIO = "n";
    private final String NAVIO = "N";
    private String cabecalho = "---------------------------------------------\n" +
            "               JOGADOR               \n" +
            "---------------------------------------------\n" +
            "|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\n" +
            "---------------------------------------------";
    public final String vetor[] = {"| A |", "| B |", "| C |", "| D |", "| E |", "| F |", "| G |", "| H |", "| I |", "| J |"};

    public Tabuleiro() {
        preencheTabuleiro();
    }

    public void imprimeTabuleiro() {
        System.out.println(cabecalho);
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            System.out.print(vetor[linha]);
            for (int colunha = 0; colunha < tabuleiro[linha].length; colunha++) {
                System.out.print(tabuleiro[linha][colunha]);
            }
            System.out.println("\n---------------------------------------------");
        }
    }

    public void preencheTabuleiro() {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int colunha = 0; colunha < tabuleiro[linha].length; colunha++) {
                tabuleiro[linha][colunha] = "   |";
            }
        }
    }
}













