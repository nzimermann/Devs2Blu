package br.com.exer11;

public class Professor extends Funcionario implements Pesquisador {
	private static final String TIPO = "Professor";

	public Professor(String nome) {
		super(nome);
	}

	@Override
	public String getTipo() {
		return TIPO;
	}

}
