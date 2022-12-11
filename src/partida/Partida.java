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
//        this.pessoa = new Pessoa();
        this.computador = new Computador();
//        pessoa.setNome();
//        computador.setNome();
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

    public void fazJogada() {

    }

}
