package br.com.exer03;

import java.util.Scanner;

public class Exer3 {

	public static void questao1(double cateto1, double cateto2) {
		System.out.println(Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2)));
	}

	public static void questao2(double lado_quadrado) {
		System.out.println(lado_quadrado * lado_quadrado);
	}

	public static void questao3() {
		double compra = (1000 * 32.87d);
		double venda = (1000 * 33.92d);
		System.out.println("a) Quantidade paga pelas ações: " + compra);
		System.out.println("b) Valor da comissão - compra: " + compra * 0.02d);
		System.out.println("c) Valor da venda das ações: " + venda);
		System.out.println("d) Valor da comissão - venda: " + venda * 0.02d);
		System.out.println("e) Valor de venda das ações: " + ((venda * 0.98d) - (compra * 0.98d)));
	}

	public static void questao4(double velocidade) {
		System.out.println("Distância para 5 horas: " + velocidade * 5 + "km");
		System.out.println("Distância para 8 horas: " + velocidade * 8 + "km");
		System.out.println("Distância para 12 horas: " + velocidade * 12 + "km");
	}

	public static void questao5(int a, int b, int c, int d, int e, int f) {
		double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		double y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

	public static void questao6(double area_terreno) {
		double acres = area_terreno / 4046.86d;
		System.out.println("Acres: " + acres);
		System.out.println("Pés quadrados: " + acres * 43560d);
		System.out.println("Hectares: " + acres * 0.404686d);
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Questão 1");
		System.out.print("Informe cateto1: ");
		double cateto1 = sc.nextDouble();
		System.out.print("Informe cateto2: ");
		double cateto2 = sc.nextDouble();
		questao1(cateto1, cateto2);

		System.out.println("\nQuestão 2");
		System.out.print("Informe a lado do quadrado: ");
		double lado = sc.nextDouble();
		questao2(lado);

		System.out.println("\nQuestão 3");
		questao3();

		System.out.println("\nQuestão 4");
		System.out.print("Velocidade em km/h: ");
		double velocidade = sc.nextDouble();
		questao4(velocidade);

		System.out.println("\nQuestão 5");
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();
		System.out.print("d: ");
		int d = sc.nextInt();
		System.out.print("e: ");
		int e = sc.nextInt();
		System.out.print("f: ");
		int f = sc.nextInt();
		questao5(a, b, c, d, e, f);

		System.out.println("\nQuestão 6");
		System.out.print("Informe a área em m2: ");
		int m2 = sc.nextInt();
		questao6(m2);

		sc.close();
	}
}
