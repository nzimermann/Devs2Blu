package br.com.exer09.parte2.q1;

class Livro {
	private String titulo;
	private Autor autor;
	private Categoria categoria;

	public Livro(String titulo, Autor autor, Categoria categoria) {
		this.setTitulo(titulo);
		this.autor = autor;
		this.setCategoria(categoria);
		autor.addLivro(this);
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(Autor autor) {
		this.autor.removeLivro(this);
		autor.addLivro(this);
		this.autor = autor;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}