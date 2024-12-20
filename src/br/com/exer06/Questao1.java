package br.com.exer06;

public class Questao1 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int somaImpar = 0, count = 0;
		for (int i : A) {
			somaImpar += (i % 2 == 0) ? 0 : i;
			count += (i % 2 == 0) ? 0 : 1;
		}
		System.out.println(somaImpar / count);
	}
}
