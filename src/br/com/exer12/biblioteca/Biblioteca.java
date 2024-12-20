package br.com.exer12.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<ItemLivro> livros;

	public Biblioteca() {
		livros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		livros.add(new ItemLivro(livro));
	}

	public void gerarRelatorioLivros() {
		for (ItemLivro livro : livros) {
			livro.gerarRelatorio();
		}
	}

	public void mostrarLivros() {
		for (ItemLivro livro : livros) {
			System.out.println(livro.getLivro().getTitulo());
		}
	}

	public ItemLivro getLivro(Livro livro) {
		for (ItemLivro itemLivro : livros) {
			if (itemLivro.getLivro() == livro)
				return itemLivro;
		}
		return null;
	}

	public void alugar(Livro livro) {
		ItemLivro itemLivro = this.getLivro(livro);
		boolean alugado = itemLivro.isAlugado();
		if (!alugado) {
			itemLivro.setAlugado(true);
			System.out.println("O livro " + itemLivro.getLivro().getTitulo() + " foi alugado.");
		} else {
			System.out.println("O livro " + itemLivro.getLivro().getTitulo() + " já está alugado.");
		}
	}
}
