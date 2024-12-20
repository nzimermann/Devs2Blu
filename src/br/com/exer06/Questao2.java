package br.com.exer06;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
			count += (A[i] > 35) ? 1 : 0;
		}

		System.out.println();

		for (int i : A) {
			if (i > 35)
				System.out.println(i);
		}

		System.out.println("Quantidade com idade maior que 35: " + count);

		sc.close();
	}
}
