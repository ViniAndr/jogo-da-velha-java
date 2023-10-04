package br.estudo.entidades;

public class Tabuleiro {
	private char[][] tabuleiro = new char[3][3];
	private char jogadorAtual = 'X';
	private int jogadas = 0;

	public Tabuleiro() {
		criarTabuleiro();
	}

	public int getJogadas() {
		return jogadas;
	}

	public char getJogadorAtual() {
		return jogadorAtual;
	}

	public void criarTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = '-';
			}
		}
	}

	public void mostrarTabela() {
		//System.out.println("  0  1  2");
		System.out.println("  0  1  2 ");
		for (int i = 0; i < tabuleiro.length; i++) {
			//System.out.print(i);
			System.out.print(i);
			for (int j = 0; j < tabuleiro.length; j++) {
				System.out.print("[" + tabuleiro[i][j] + "]");
			}
			System.out.println();
		}
	}

	public void trocarJogador() {
		jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
	}

	public void receberPosicao(int linha, int coluna) {
		if (tabuleiro[linha][coluna] == '-') {
			if (linha < 3 && coluna < 3) {
				colocarNaPosicao(linha, coluna);
			} else
				System.out.printf("%nDigite uma posição menor que o tamanho do tabuleiro%n");
		} else
			System.out.printf("%nDigite uma posição que ainda não foi usada%n%n");
	}

	public void colocarNaPosicao(int linha, int coluna) {
		tabuleiro[linha][coluna] = jogadorAtual;
		trocarJogador();
		mostrarTabela();
		jogadas++;
	}

	public char verificarVencedor() {
		// verificar na linha
		for (int linha = 0; linha < 3; linha++) {
			if (tabuleiro[linha][0] == tabuleiro[linha][1] && tabuleiro[linha][1] == tabuleiro[linha][2]
					&& tabuleiro[linha][0] != '-')	
				return tabuleiro[linha][0];
		}

		// verificar se foi na coluna
		for (int coluna = 0; coluna < 3; coluna++) {
			if (tabuleiro[0][coluna] == tabuleiro[1][coluna] && tabuleiro[1][coluna] == tabuleiro[2][coluna]
					&& tabuleiro[0][coluna] != '-')
				return tabuleiro[0][coluna];
		}

		// vericar na diagonal da esquerda para direita
		if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != '-')
			return tabuleiro[0][0];

		// vericar na diagonal da direita para esquerda
		if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != '-')
			return tabuleiro[0][2];

		return '-';
	}
}
