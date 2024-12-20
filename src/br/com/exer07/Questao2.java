package br.com.exer07;

import java.sql.Date;
import java.time.LocalDate;

public class Questao2 {
	public class Teste {
		public int qtdQuestoes;
		public Materia materia;
		public Date dataGerada;
		public Questao[] listaQuestoes;

		public Teste(int qtdQuestoes, Materia materia, Questao[] listaQuestoes) {
			super();
			this.qtdQuestoes = qtdQuestoes;
			this.materia = materia;
			this.dataGerada = Date.valueOf(LocalDate.now());
			this.listaQuestoes = listaQuestoes;
		}
	}

	public class Disciplina {
		public String nome;
		public Materia[] listaMaterias;
		public Questao[] listaQuestoes;

		public Disciplina(String nome, Materia[] listaMaterias, Questao[] listaQuestoes) {
			super();
			this.nome = nome;
			this.listaMaterias = listaMaterias;
			this.listaQuestoes = listaQuestoes;
		}

		public void adicionarQuestao(Questao questao) {
			Questao[] novaLista = new Questao[listaQuestoes.length + 1];
			for (int i = 0; i < listaQuestoes.length; i++) {
				novaLista[i] = listaQuestoes[i];
			}
			novaLista[novaLista.length - 1] = questao;
			this.listaQuestoes = novaLista;
		}
	}

	public class Materia {
		public String nome;
		public Disciplina disciplina;

		public Materia(String nome, Disciplina disciplina) {
			super();
			this.nome = nome;
			this.disciplina = disciplina;
		}
	}

	public class Questao {
		public int bimestre;
		public Materia materia;
		public String enunciado;
		public String gabarito;

		public Questao(int bimestre, Materia materia, String enunciado, String gabarito) {
			super();
			this.bimestre = bimestre;
			this.materia = materia;
			this.enunciado = enunciado;
			this.gabarito = gabarito;
		}

		public void mudarEnunciado(String enunciado) {
			this.enunciado = enunciado;
		}
	}
}
