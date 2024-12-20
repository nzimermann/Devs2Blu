package br.com.exer07.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Jogo jogo = new JogoDaVelha().new Jogo();
		jogo.iniciar();
	}

	public class Jogo {
		private Tabuleiro tabuleiro;
		private Jogador jogador1;
		private Jogador jogador2;
		private Scanner scan;

		public Jogo() {
			this.tabuleiro = new Tabuleiro();
			this.jogador1 = new Jogador('X');
			this.jogador2 = new Jogador('O');
			this.scan = new Scanner(System.in);
		}

		public void iniciar() {
			System.out.println("Jogador 1 = X");
			System.out.println("Jogador 2 = O");

			Jogador jogadorAtual = jogador1;
			boolean fimPartida = false;
			int jogada = 1;

			while (!fimPartida && jogada <= 9) {
				System.out.print("Vez do " + (jogadorAtual == jogador1 ? "Jogador 1. " : "Jogador 2. "));
				System.out.println("Escolha linha e coluna (1-3)");

				int linha = getJogada("linha") - 1;
				int coluna = getJogada("coluna") - 1;

				if (tabuleiro.jogar(linha, coluna, jogadorAtual.getSinal())) {
					jogada++;
					if (tabuleiro.verificaVencedor(jogadorAtual.getSinal())) {
						System.out.println(
								"Parabéns, " + (jogadorAtual == jogador1 ? "jogador 1" : "jogador 2") + " ganhou!");
						fimPartida = !fimPartida;
						tabuleiro.imprimir();
						break;
					} else if (jogada > 9) {
						System.out.println("Ninguém ganhou essa partida.");
					}
					jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
				} else {
					System.out.println("Posição já usada, tente novamente");
				}
				System.out.println("Linha " + linha + ", Coluna " + coluna);
				tabuleiro.imprimir();
			}
			scan.close();
		}

		public int getJogada(String tipoEntrada) {
			int valor = 0;
			boolean valido = false;
			while (!valido) {
				System.out.println("Entre com a " + tipoEntrada + " (1, 2 ou 3)");
				valor = scan.nextInt();
				if (valor >= 1 && valor <= 3) {
					valido = !valido;
				} else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}
			return valor;
		}
	}

	public class Tabuleiro {
		private char[][] tabuleiro;

		public Tabuleiro() {
			this.tabuleiro = new char[3][3];
		}

		public boolean jogar(int linha, int coluna, char simbolo) {
			if (tabuleiro[linha][coluna] == 0) { // está vazio
				tabuleiro[linha][coluna] = simbolo;
				return true;
			}
			return false;
		}

		public void imprimir() {
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println();
				if (i < 2)
					System.out.println("-----------");
			}
		}

		public boolean verificaVencedor(char sinal) {
			return ((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) || // linha 1
					(tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) || // linha 2
					(tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) || // linha 3
					(tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) || // coluna 1
					(tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) || // coluna 2
					(tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) || // coluna 3
					(tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal)); // diagonal
		}
	}

	public class Jogador {
		private char sinal;

		public Jogador(char sinal) {
			this.sinal = sinal;
		}

		public char getSinal() {
			return sinal;
		}
	}
}
