package br.com.exer02;

import java.util.Scanner;

public class Exer2 {

	public static void questao1(double saldo) {
		System.out.println(saldo * 1.01);
	}

	public static void questao2() {
		double media1 = ((8 + 9 + 7) / 3);
		double media2 = ((4 + 5 + 6) / 3);
		System.out.println("Média 8, 9 e 7: " + media1);
		System.out.println("Média 4, 5 e 6: " + media2);
		System.out.println("Soma: " + (media1 + media2));
		System.out.println("Média das médias: " + ((media1 + media2) / 2));
	}

	public static void questao3(double valor1, double valor2) {
		System.out.println("Soma: " + (valor1 + valor2));
		System.out.println("Dobro da soma: " + ((valor1 + valor2) * 2));
	}

	public static void questao4(int idade) {
		System.out.println("Idade: " + idade);
	}

	public static void questao5(int t_minutos) {
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", (2.30 * (t_minutos / 60))) + " (hora)");
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", (2.30 * (t_minutos / 60d))) + " (minuto)");
	}

	public static void questao6(int qtd_folhas) {
		System.out.println("Valor a ser pago: R$ " + String.format("%.2f", (qtd_folhas * 0.16)));
	}

	public static void questao7(String nome, int idade) {
		System.out.println(nome + " - Dias vividos (aproximado): " + (idade * 365));
	}

	public static void questao8(int horas) {
		System.out.println("Minutos: " + horas * 60);
		System.out.println("Segundos: " + horas * 3600);
	}

	public static void questao9(double valor) {
		System.out.println("Valor com desconto: R$ " + String.format("%.2f", (valor * 0.91)));
	}

	public static void questao10(double salario_base) {
		System.out.println("Salário a receber: R$ " + String.format("%.2f", (salario_base * 0.98)));
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Questão 1");
		questao1(100);

		System.out.println("\nQuestão 2");
		questao2();

		System.out.println("\nQuestão 3");
		questao3(5, 5);

		System.out.println("\nQuestão 4");
		questao4(10);

		System.out.println("\nQuestão 5");
		System.out.print("Minutos usados pelo cliente: ");
		int t_minutos = sc.nextInt();
		questao5(t_minutos);

		System.out.println("\nQuestão 6");
		System.out.print("Quantidade de folhas: ");
		int qtd_folhas = sc.nextInt();
		questao6(qtd_folhas);

		System.out.println("\nQuestão 7");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		questao7(nome, idade);

		System.out.println("\nQuestão 8");
		questao8(2);

		System.out.println("\nQuestão 9");
		System.out.print("Valor do produto: ");
		double valor_produto = sc.nextDouble();
		questao9(valor_produto);

		System.out.println("\nQuestão 10");
		System.out.print("Informe salário base: ");
		double salario_base = sc.nextDouble();
		questao10(salario_base);

		sc.close();
	}
}
