package br.com.exer06;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a quantidade de cidadãos entrevistados: ");
		int qtdCidadao = sc.nextInt();

		String[][][] matriz = new String[qtdCidadao][][];

		for (int i = 0; i < qtdCidadao; i++) {
			System.out.print("Insira a quantidade de filhos do cidadão: ");
			int qtd = sc.nextInt();

			matriz[i] = new String[qtd][2];

			for (int j = 0; j < Math.abs(qtd); j++) {
				System.out.print("Nome " + (j + 1) + ": ");
				matriz[i][j][0] = sc.next();
				System.out.print("Idade: ");
				matriz[i][j][1] = sc.next();
			}
		}

		System.out.println("\nQuantidade de pessoas entrevistadas: " + matriz.length);
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Quantidade de filhos do entrevistado " + (i + 1) + ": " + matriz[i].length);
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println((j + 1) + " > " + matriz[i][j][0] + " - idade: " + matriz[i][j][1]);
			}
		}

		sc.close();
	}
}
