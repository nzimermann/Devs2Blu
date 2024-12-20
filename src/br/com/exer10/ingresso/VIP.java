package br.com.exer10.ingresso;

public class VIP extends Ingresso {

	public VIP(double valor, String localizacao) {
		super(valor, localizacao);
	}

	public VIP(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional, localizacao);
	}

	@Override
	String getTipo() {
		return "VIP";
	}

}
