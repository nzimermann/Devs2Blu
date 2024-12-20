package br.com.exer09.parte1;

import java.time.LocalDate;

public class Questao2 {

	public class Teste {
		private int qtdQuestoes;
		private Materia materia;
		private LocalDate dataGerada;
		private Questao[] listaQuestoes;

		public Teste(int qtdQuestoes, Materia materia, Questao[] listaQuestoes) {
			super();
			this.setQtdQuestoes(qtdQuestoes);
			this.setMateria(materia);
			this.setDataGerada(LocalDate.now());
			this.setListaQuestoes(listaQuestoes);
		}

		public int getQtdQuestoes() {
			return qtdQuestoes;
		}

		public void setQtdQuestoes(int qtdQuestoes) {
			this.qtdQuestoes = qtdQuestoes;
		}

		public Materia getMateria() {
			return materia;
		}

		public void setMateria(Materia materia) {
			this.materia = materia;
		}

		public LocalDate getDataGerada() {
			return dataGerada;
		}

		public void setDataGerada(LocalDate dataGerada) {
			this.dataGerada = dataGerada;
		}

		public Questao[] getListaQuestoes() {
			return listaQuestoes;
		}

		public void setListaQuestoes(Questao[] listaQuestoes) {
			this.listaQuestoes = listaQuestoes;
		}
	}

	public class Disciplina {
		private String nome;
		private Materia[] listaMaterias;
		private Questao[] listaQuestoes;

		public Disciplina(String nome, Materia[] listaMaterias, Questao[] listaQuestoes) {
			super();
			this.setNome(nome);
			this.setListaMaterias(listaMaterias);
			this.setListaQuestoes(listaQuestoes);
		}

		public void adicionarQuestao(Questao questao) {
			Questao[] novaLista = new Questao[listaQuestoes.length + 1];
			for (int i = 0; i < listaQuestoes.length; i++) {
				novaLista[i] = listaQuestoes[i];
			}
			novaLista[novaLista.length - 1] = questao;
			this.listaQuestoes = novaLista;
		}

		public void adicionarMateria(Materia materia) {
			Materia[] novaLista = new Materia[listaMaterias.length + 1];
			for (int i = 0; i < listaMaterias.length; i++) {
				novaLista[i] = listaMaterias[i];
			}
			novaLista[novaLista.length - 1] = materia;
			this.listaMaterias = novaLista;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Materia[] getListaMaterias() {
			return listaMaterias;
		}

		public void setListaMaterias(Materia[] listaMaterias) {
			this.listaMaterias = listaMaterias;
		}

		public Questao[] getListaQuestoes() {
			return listaQuestoes;
		}

		public void setListaQuestoes(Questao[] listaQuestoes) {
			this.listaQuestoes = listaQuestoes;
		}
	}

	public class Materia {
		private String nome;
		private Disciplina disciplina;

		public Materia(String nome, Disciplina disciplina) {
			super();
			this.setNome(nome);
			this.setDisciplina(disciplina);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Disciplina getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
	}

	public class Questao {
		private int bimestre;
		private Materia materia;
		private String enunciado;
		private String gabarito;

		public Questao(int bimestre, Materia materia, String enunciado, String gabarito) {
			super();
			this.setBimestre(bimestre);
			this.setMateria(materia);
			this.setEnunciado(enunciado);
			this.setGabarito(gabarito);
		}

		public void mudarEnunciado(String enunciado) {
			this.enunciado = enunciado;
		}

		public int getBimestre() {
			return bimestre;
		}

		public void setBimestre(int bimestre) {
			this.bimestre = bimestre;
		}

		public Materia getMateria() {
			return materia;
		}

		public void setMateria(Materia materia) {
			this.materia = materia;
		}

		public String getEnunciado() {
			return enunciado;
		}

		public void setEnunciado(String enunciado) {
			this.enunciado = enunciado;
		}

		public String getGabarito() {
			return gabarito;
		}

		public void setGabarito(String gabarito) {
			this.gabarito = gabarito;
		}
	}

}
