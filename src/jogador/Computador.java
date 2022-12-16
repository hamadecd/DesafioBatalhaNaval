package jogador;

import java.util.Random;

public class Computador extends Jogador {

    public Computador() {
        posicionaPecasAutomaticamente();
    }

    public void fazJogada(Jogador pessoa) {
        Random random = new Random();
        int linha = random.nextInt(0, 10);
        int coluna = random.nextInt(0, 10);
        int ponto = tabuleiro.gravaTabuleiro(linha, coluna, pessoa.tabuleiro.getGrade());
        if (ponto > 0) {
            setQuantidadeAcertos(getQuantidadeAcertos()+1);
        } else if (ponto == -1) {
            fazJogada(pessoa);
        }
    }

}
