package br.com.exer10.ingresso;

public class CamaroteInferior extends Ingresso {

	public CamaroteInferior(double valor, String localizacao) {
		super(valor, localizacao);
	}

	public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional, localizacao);
	}

	@Override
	String getTipo() {
		return "Camarote Inferior";
	}

}
