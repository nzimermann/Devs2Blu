package br.com.exer12.biblioteca;

public class ItemLivro {
	private Livro livro;
	private Categoria categoria;
	private boolean alugado;

	public ItemLivro(Livro livro) {
		this.setLivro(livro);
		this.alugado = false;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Livro getLivro() {
		return this.livro;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void gerarRelatorio() {
		System.out.println("Título: " + this.livro.getTitulo());
		System.out.println("Autor: " + this.livro.getAutor().getNome());
		System.out.println("Status: " + (alugado ? "Alugado" : "Disponível"));
	}
}
