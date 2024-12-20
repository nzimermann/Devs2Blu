package br.com.exer12.biblioteca;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Autor autor1 = new Autor("George Orwell");
		Livro livro1 = new Livro("1984", autor1);

		Autor autor2 = new Autor("Miguel de Cervantes");
		Livro livro2 = new Livro("Dom Quixote", autor2);

		biblioteca.adicionarLivro(livro1);
		biblioteca.adicionarLivro(livro2);

		biblioteca.alugar(livro1);
		biblioteca.alugar(livro2);

		biblioteca.gerarRelatorioLivros();
	}
}
