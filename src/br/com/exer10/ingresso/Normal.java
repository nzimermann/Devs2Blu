package br.com.exer10.ingresso;

public class Normal extends Ingresso {

	public Normal(double valor, String localizacao) {
		super(valor, localizacao);
	}

	public Normal(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional, localizacao);
	}

	@Override
	String getTipo() {
		return "Normal";
	}

}
