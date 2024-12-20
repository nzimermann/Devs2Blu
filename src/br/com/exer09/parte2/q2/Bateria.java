package br.com.exer09.parte2.q2;

public class Bateria {
	public static final int MIN_CARGA = 0;
	public static final int MAX_CARGA = 100;
	private int carga;

	public Bateria() {
		this.carga = MAX_CARGA;
	}

	public Bateria(int cargaInicial) {
		this.setCarga(cargaInicial);
	}

	public int getCarga() {
		return this.carga;
	}

	public void setCarga(int carga) {
		if (!(carga >= MIN_CARGA && carga <= MAX_CARGA))
			throw new IllegalArgumentException("Carga deve estar entre 0 e 100");

		this.carga = carga;
	}

	public void consumirBateria(int quantidade) {
		int novaCarga = this.getCarga() - quantidade;
		if (novaCarga <= MIN_CARGA) {
			this.setCarga(MIN_CARGA);
		} else {
			this.setCarga(novaCarga);
		}
	}

	public void recarregarBateria() {
		carga = MAX_CARGA;
	}

}
