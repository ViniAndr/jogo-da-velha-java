package br.estudo.entidades;

public class Tabuleiro {
	private char[][] tabuleiro = new char[3][3];
	
	public Tabuleiro() {
		criarTabuleiro();
	}

	public void criarTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = '-';
			}
		}
	}

	public void mostrarTabela() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				System.out.print("[" + tabuleiro[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public void receberPosicao(int linha, int coluna) {
		tabuleiro[linha][coluna] = 'X';
		mostrarTabela();
	}
}
