package br.com.exer12.biblioteca;

public class Livro {
	private String titulo;
	private Autor autor; // Associação

	public Livro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}
}
