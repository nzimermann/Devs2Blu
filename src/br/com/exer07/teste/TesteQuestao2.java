package br.com.exer07.teste;

import br.com.exer07.Questao2;

public class TesteQuestao2 {

	public static void main(String[] args) {
		Questao2.Materia materia = new Questao2().new Materia("Matematica", null);

		Questao2.Questao q1 = new Questao2().new Questao(1, materia, "Qual é o valor de 2+2?", "4");
		Questao2.Questao q2 = new Questao2().new Questao(2, materia, "Qual é o valor de 3+3?", "6");

		Questao2.Teste teste = new Questao2().new Teste(2, materia, new Questao2.Questao[] { q1, q2 });

		System.out.println(teste.qtdQuestoes);
		System.out.println(teste.materia.nome);
		System.out.println(teste.dataGerada);
		System.out.println(teste.listaQuestoes[0].enunciado);
		System.out.println(teste.listaQuestoes[0].gabarito);
		System.out.println(teste.listaQuestoes[1].enunciado);
		System.out.println(teste.listaQuestoes[1].gabarito);
	}
}
