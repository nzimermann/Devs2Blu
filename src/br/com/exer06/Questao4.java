package br.com.exer06;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[5];
		int[] dvds = new int[5];

		System.out.println("Insira 5 nomes:");
		for (int i = 0; i < 5; i++) {
			System.out.print("> ");
			nomes[i] = sc.next();
		}

		System.out.println("\nQuantidade de DVDs alocados:");
		for (int i = 0; i < 5; i++) {
			System.out.print("> ");
			dvds[i] = sc.nextInt();
		}

		System.out.println("\nQuantidade de locações grátis:");
		for (int i = 0; i < 5; i++) {
			System.out.println("> " + nomes[i] + ": " + (dvds[i] / 10));
		}

		sc.close();
	}
}
