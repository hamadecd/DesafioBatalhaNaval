package partida;

import jogador.Computador;
import jogador.Jogador;
import jogador.Pessoa;
import tabuleiro.Tabuleiro;

import java.util.Scanner;

public class Partida {
    public Jogador pessoa;
    public Jogador computador;

    public Partida() {
        this.pessoa = new Pessoa();
        this.computador = new Computador();
    }

    public static int getNumero(String frase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(frase);
        try {
            return scanner.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Número inválido!");
            return getNumero(frase);
        }
    }

    public void iniciaJogo() {
        boolean selecionaJogador = true;
        do {
            if (selecionaJogador == true) {
                computador.fazJogada(pessoa);
                pessoa.imprimeTabuleiro(); // APAGAR ESSA LINHA
                selecionaJogador = false;
            } else {
                pessoa.fazJogada(computador);
                computador.imprimeTabuleiro();
                selecionaJogador = true;
            }
//            contadorPartidas++;
//            if (contadorPartidas > )
        } while (pessoa.getQuantidadeAcertos() < 1 && computador.getQuantidadeAcertos() < 1);
        exibeVencedor();
    }

    public void exibeVencedor() {
        if (pessoa.getQuantidadeAcertos() == 1) {
            System.out.println("Jogo acabou! " + pessoa.getNome() + " venceu o jogo!");
        } else {
            System.out.println("Jogo acabou! Brainiac venceu o jogo!");
        }
        System.exit(0);
    }

}
