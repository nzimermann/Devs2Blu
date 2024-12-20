package br.com.exer10.ingresso;

public class CamaroteSuperior extends Ingresso {

	public CamaroteSuperior(double valor, String localizacao) {
		super(valor, localizacao);
	}

	public CamaroteSuperior(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional, localizacao);
	}

	@Override
	String getTipo() {
		return "Camarote Superior";
	}

}
