package br.com.exer14.principioDIP;

public class Usuario {
	private String nome;

	public Usuario(String nome) {
		super();
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
