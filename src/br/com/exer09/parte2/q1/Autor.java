package br.com.exer09.parte2.q1;

import java.util.ArrayList;
import java.util.List;

class Autor {
	private String nome;
	private List<Livro> livros;

    public Autor(String nome) {
        this.setNome(nome);
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public void addLivro(Livro livro) {
    	this.getLivros().add(livro);
    }
    
    public void removeLivro(Livro livro) {
    	this.getLivros().remove(livro);
    }

}