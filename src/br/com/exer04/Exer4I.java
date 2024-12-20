package br.com.exer04;

import java.util.Scanner;

public class Exer4I {

	public static void questao1(int num) {
		if ((num % 2) == 0) {
			System.out.println("Número par");
			return;
		}
		System.out.println("Número ímpar");
	}

	public static void questao2(int idade) {
		if (idade >= 18) {
			System.out.println("Adulto");
		} else if (idade >= 14) {
			System.out.println("Juvenil B");
		} else if (idade >= 11) {
			System.out.println("Juvenil A");
		} else if (idade >= 8) {
			System.out.println("Infantil B");
		} else if (idade >= 5) {
			System.out.println("Infantil A");
		} else {
			System.out.println("Idade inválida");
		}
	}

	public static void questao3(int cod_fruto, double preco) {
		switch (cod_fruto) {
		case 1:
			System.out.println("Laranja: R$" + (preco * 60));
			break;
		case 2:
			System.out.println("Limão: R$" + (preco * 80));
			break;
		case 3:
			System.out.println("Morango: R$" + (preco * 20));
			break;
		default:
			System.out.println("Fruta selecionada inválida");
		}
	}

	public static void questao4(double num1, double num2, int operador) {
		System.out.print("Resultado: ");
		switch (operador) {
		case 1:
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Não é possível dividir por zero!");
				break;
			}
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("operação invalida");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Questão 1");
		System.out.print("Informe um número: ");
		questao1(sc.nextInt());

		System.out.println("\nQuestão 2");
		System.out.print("Idade: ");
		questao2(sc.nextInt());

		System.out.println("\nQuestão 3");
		System.out.println("Selecione uma fruta:");
		System.out.print("1 - Laranja\n2 - Limão\n3 - Morango\n>> ");
		int fruta = sc.nextInt();
		System.out.print("Informe o preço unitário: R$");
		double preco = sc.nextDouble();
		questao3(fruta, preco);

		System.out.println("\nQuestão 4");
		System.out.print("Primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.print("Segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("Selecione um operador:");
		System.out.print("1: +\n2: -\n3: *\n4: /\n>> ");
		int operador = sc.nextInt();
		questao4(num1, num2, operador);

		sc.close();
	}
}
