package br.com.exer06;

public class Questao3 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 20, 16, 10, 15 };
		int soma = 0, qtd = 0, somaMedia = 0, qtdMedia = 0;

		for (int i : A) {
			if (i < 15)
				soma += i;
			if (i == 15)
				qtd++;
			if (i > 15) {
				somaMedia += i;
				qtdMedia++;
			}
		}
		double media = (qtdMedia <= 0) ? 0 : (somaMedia / qtdMedia);
		System.out.println("Soma (< 15): " + soma);
		System.out.println("Quantidade (= 15): " + qtd);
		System.out.println("Média (> 15): " + media);
	}
}
