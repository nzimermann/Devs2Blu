package br.com.exer11;

public abstract class Funcionario {
	private String nome;

	public Funcionario(String nome) {
		super();
		this.setNome(nome);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
