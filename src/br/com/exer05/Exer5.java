package br.com.exer05;

import java.util.Scanner;

public class Exer5 {

	public static void questao1() {
		int chico = 150;
		int juca = 110;
		int anos = 0;
		while (juca <= chico) {
			chico += 2;
			juca += 3;
			anos++;
		}
		System.out.println("Serão necessários " + anos + " anos");
		System.out.println("Juca terá " + juca + "cm e Chico terá " + chico + "cm.");
	}

	public static void questao2(int limiteInf, int limiteSup) {
		int somatorio = 0;
		String sequencia = "";
		limiteInf = (limiteInf % 2 == 0) ? limiteInf : ++limiteInf;
		for (int i = limiteInf; i < limiteSup; i += 2) {
			sequencia += i + " ";
			somatorio += i;
		}
		System.out.println("Saída: " + sequencia);
		System.out.println("Soma: " + somatorio);
	}

	public static void questao3(int num) {
		if (num <= 1)
			System.out.println(num + " não é primo");

		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0) {
				System.out.println(num + " não é primo");
				return;
			}
		System.out.println(num + " é primo");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Questão 1");
		questao1();

		System.out.println("\nQuestão 2");
		System.out.print("Limite inferior: ");
		int limiteInf = sc.nextInt();
		System.out.print("Limite superior: ");
		int limiteSup = sc.nextInt();
		questao2(limiteInf, limiteSup);

		System.out.println("\nQuestão 3");
		System.out.print("Insira um número inteiro: ");
		int num = sc.nextInt();
		questao3(num);

		System.out.println("\nQuestão 4");
		System.out.print("Cadastre o usuário: ");
		sc.next();
		System.out.print("Cadastre a senha: ");
		String senha = sc.next();
		System.out.print("usuário: ");
		sc.next();
		for (int i = 1; i <= 3; i++) {
			System.out.println("(Tentativa " + i + ")");
			System.out.print("senha: ");
			String checkSenha = sc.next();
			if (checkSenha.equals(senha)) {
				System.out.println("Senha correta!");
				break;
			}
		}

		System.out.println("\nQuestão 5");
		int n = 4; // número da adivinhação
		System.out.println("Adivinhe o número de 1 à 10: ");
		int input;
		do {
			input = sc.nextInt();
		} while (n != input);

		System.out.println("Você adivinhou o número!");

		sc.close();
	}
}
