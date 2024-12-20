package br.com.exer09.parte2.q1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;

	public Biblioteca(Livro livro) {
		super();
		this.livros = new ArrayList<Livro>();
		this.addLivro(livro);
	}

	public Biblioteca(List<Livro> livros) {
		super();
		this.livros = new ArrayList<Livro>();
		this.setLivros(livros);
	}

	public void setLivros(List<Livro> livros) {
		if (livros.isEmpty()) // composição
			throw new IllegalArgumentException("Deve existir no mínimo 1 livro");

		this.livros = livros;
	}

	public void addLivro(Livro livro) {
		this.getLivros().add(livro);
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public Livro getLivro(String titulo) {
		Livro livro = null;
		for (Livro l : this.getLivros()) {
			if (l.getTitulo().equals(titulo)) {
				livro = l;
				break;
			}
		}
		if (livro == null)
			throw new IllegalArgumentException("Título não encontrado");

		return livro;
	}
}
