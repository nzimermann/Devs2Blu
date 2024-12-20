package br.com.exer04;

import java.util.Scanner;

public class Exer4II {

	public static void questao1(double vCompra, double vPagamento) {
		if (vPagamento < vCompra) {
			System.out.println("Pagamento Negado");
			return;
		}

		double troco = vPagamento - vCompra;

		double n100 = (int) troco / 100;
		troco -= n100 * 100;
		double n10 = (int) troco / 10;
		troco -= n10 * 10;
		double n1 = (int) troco / 1;
		troco -= n1;
		System.out.println((int) n100 + " notas de R$ 100");
		System.out.println((int) n10 + " notas de R$ 10");
		System.out.println((int) n1 + " notas de R$ 1");
	}

	public static void questao2(String nome, double n1, double n2, double n3, double mediaExer) {
		double aproveitamento = (n1 + (n2 * 2) + (n3 * 3) + mediaExer) / 7;
		System.out.print("Conceito: ");
		if (aproveitamento >= 9) {
			System.out.println("A");
		} else if (aproveitamento >= 7.5) {
			System.out.println("B");
		} else if (aproveitamento >= 6) {
			System.out.println("C");
		} else if (aproveitamento < 6) {
			System.out.println("D");
		}
	}

	public static void questao3(double saldoMedio) {
		if (saldoMedio > 600) {
			System.out.println("Saldo médio: R$" + saldoMedio);
			System.out.println("Crédito: R$" + saldoMedio * 0.4d);
		} else if (saldoMedio > 400) {
			System.out.println("Saldo médio: R$" + saldoMedio);
			System.out.println("Crédito: R$" + saldoMedio * 0.3d);
		} else if (saldoMedio > 200) {
			System.out.println("Saldo médio: R$" + saldoMedio);
			System.out.println("Crédito: R$" + saldoMedio * 0.2d);
		} else if (saldoMedio >= 0) {
			System.out.println("Saldo médio: R$" + saldoMedio);
			System.out.println("Nenhum crédito");
		} else {
			System.out.println("SALDO MÉDIO NEGATIVO!");
		}
	}

	public static void questao4(double num1, double num2, int operador) {
		double resultado = 0;
		switch (operador) {
		case 1:
			resultado = (num1 + num2);
			break;
		case 2:
			resultado = (num1 - num2);
			break;
		case 3:
			resultado = (num1 * num2);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Não é possível dividir por zero!");
				return;
			}
			resultado = (num1 / num2);
			break;
		default:
			System.out.println("operação invalida");
			return;
		}
		System.out.println("Resultado: " + resultado);
		System.out.println((resultado > 0) ? "Resultado é positivo" : "Resultado é negaivo");
		System.out.println(((resultado % 2) == 0) ? "Resultado é par" : "Resultado é ímpar");
	}

	public static void questao5(double valor, int formaPagamento) {
		if (formaPagamento != 1 && formaPagamento != 2) {
			System.out.println("Forma de pagamento inválida");
			return;
		}
		if (formaPagamento == 2) {
			System.out.println("Valor a ser pago: R$" + valor);
		} else {
			System.out.println("Valor a ser pago: R$" + ((valor < 100) ? valor : (valor * 0.9))); // -10%
		}
	}

	public static void questao6(char letra) {
		letra = Character.toUpperCase(letra);
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println(letra + " é uma vogal.");
			return;
		}
		if (letra < 'A' || letra > 'Z') {
			System.out.println(letra + " não é uma letra válida");
			return;
		}
		System.out.println(letra + " é uma consoante");
	}

	public static boolean questao7(int ano) {
		boolean bissexto = false;
		if (ano % 400 == 0) {
			bissexto = true;
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			bissexto = true;
		}
		return bissexto;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Questão 1");
		System.out.print("Informe valor da compra: ");
		double vCompra = sc.nextDouble();
		System.out.print("Informe valor do pagamento: ");
		double vPagamento = sc.nextDouble();
		questao1(vCompra, vPagamento);

		System.out.println("\nQuestão 2");
		System.out.print("Nome do(a) aluno(a): ");
		String nome = sc.next();
		System.out.print("Nota 1: ");
		double n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		double n3 = sc.nextDouble();
		System.out.print("Média dos exercícios: ");
		double media = sc.nextDouble();
		questao2(nome, n1, n2, n3, media);

		System.out.println("\nQuestão 3");
		System.out.print("Informe saldo médio: ");
		double saldo = sc.nextDouble();
		questao3(saldo);

		System.out.println("\nQuestão 4");
		System.out.print("Informe primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.print("Informe segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("Selecione um operador:");
		System.out.print("1: +\n2: -\n3: *\n4: /\n> ");
		int operador = sc.nextInt();
		questao4(num1, num2, operador);

		System.out.println("\nQuestão 5");
		System.out.print("Informe o valor do produto: ");
		double valorProduto = sc.nextDouble();
		System.out.println("Selecione uma forma de pagamento:");
		System.out.print("1 - Dinheiro\n2 - Cheque\n> ");
		int formaPagamento = sc.nextInt();
		questao5(valorProduto, formaPagamento);

		System.out.println("\nQuestão 6");
		System.out.print("Informe uma letra: ");
		String input = sc.next();
		char letra = input.charAt(0);
		questao6(letra);

		System.out.println("\nQuestão 7");
		System.out.print("Insira um ano: ");
		int ano = sc.nextInt();
		System.out.println(((questao7(ano)) ? "Ano bissexto" : "Ano não é bissexto"));

		sc.close();
	}
}
