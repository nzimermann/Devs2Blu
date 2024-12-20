package br.com.exer11;

public class Aluno implements Pesquisador {
	private static final String TIPO = "Aluno";
	private String nome;

	public Aluno(String nome) {
		super();
		this.setNome(nome);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getTipo() {
		return TIPO;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
