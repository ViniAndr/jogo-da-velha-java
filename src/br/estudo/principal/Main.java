package br.estudo.principal;

import java.util.Scanner;

import br.estudo.entidades.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Scanner in = new Scanner(System.in);
		int linha = in.nextInt();
		int coluna = in.nextInt();
		tabuleiro.receberPosicao(linha, coluna);
		in.close();
	}

}
