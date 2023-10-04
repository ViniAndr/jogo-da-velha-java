package br.estudo.principal;

import java.util.Scanner;

import br.estudo.entidades.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Scanner in = new Scanner(System.in);

		while (tabuleiro.getJogadas() < 9) {
			System.out.printf("Jogador \u001B[31m%c\u001B[0m insira a linha (0-2): ", tabuleiro.getJogadorAtual() );
			int linha = in.nextInt();
			System.out.printf("Jogador \u001B[31m%c\u001B[0m insira a coluna (0-2): ", tabuleiro.getJogadorAtual() );
			int coluna = in.nextInt();
			tabuleiro.receberPosicao(linha, coluna);
			if (tabuleiro.verificarVencedor() != '-') {
				System.out.println("Jogador " + tabuleiro.verificarVencedor() + " Ganhou a rodada");
				break;
			}
		}
		;

		in.close();
	}

}
