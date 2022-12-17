package partida;

import jogador.Computador;
import jogador.Jogador;
import jogador.Pessoa;
import tabuleiro.Tabuleiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Partida {
    public Pessoa pessoa = new Pessoa();
    public Computador computador = new Computador();

    public Partida() {
//        this.pessoa = new Pessoa();
//        this.computador = new Computador();
        iniciaJogo();
    }

    public static int getNumero(String frase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(frase);
        int retorno;
        try {
            retorno = scanner.nextInt();
            if (retorno >= 0 && retorno <= 9) {
                return retorno;
            } else {
                throw new IllegalArgumentException("Informe um número de 0 a 9");
            }
        } catch (InputMismatchException e) {
            System.out.println("Número inválido!");
            return getNumero(frase);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getNumero(frase);
        }
    }

    public void iniciaJogo() {
        boolean selecionaJogador = true;
        do {
            if (selecionaJogador == true) {
                computador.fazJogada(pessoa);
                computador.tabuleiro.imprimeTabuleiro(); // APAGAR ESSA LINHA
                selecionaJogador = false;
            } else {
                pessoa.fazJogada(computador);
                pessoa.tabuleiro.imprimeTabuleiro();
                selecionaJogador = true;
            }
        } while (pessoa.getQuantidadeAcertos() < 10 && computador.getQuantidadeAcertos() < 10);
        exibeVencedor();
    }

    public void exibeVencedor() {
        if (pessoa.getQuantidadeAcertos() == 10) {
            System.out.println("Jogo acabou! " + pessoa.getNome() + " venceu!");
        } else {
            System.out.println("Jogo acabou! Brainiac venceu!");
        }
        System.out.println("TABULEIRO DO JOGADOR " + pessoa.getNome() + " APÓS PARTIDA");
        pessoa.tabuleiro.imprimeTabuleiro();
        System.out.println("TABULEIRO COMPUTADOR APÓS PARTIDA");
        computador.tabuleiro.imprimeTabuleiro();
        System.exit(0);
    }

}
