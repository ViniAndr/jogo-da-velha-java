package br.estudo.principal;

import java.util.Scanner;

import br.estudo.entidades.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Jogador " + tabuleiro.getJogadorAtual() + ", insira a linha (0-2) e a coluna (0-2): ");
			int linha = in.nextInt();
			int coluna = in.nextInt();
			tabuleiro.receberPosicao(linha, coluna);
			if (tabuleiro.verificarVencedor() != '-') {
				System.out.println("Jogador " + tabuleiro.getJogadorAtual() + "Ganhou a rodada");
				break;
			}
		} while (tabuleiro.getPosicaoOk());

		in.close();
	}

}
