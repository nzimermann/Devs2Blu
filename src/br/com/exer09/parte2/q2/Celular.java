package br.com.exer09.parte2.q2;

public class Celular {
	private Bateria bateria;

	public Celular() { // Cria celular com bateria cheia
		this.bateria = new Bateria(Bateria.MAX_CARGA);
	}

	public Celular(Bateria bateria) {
		this.setBateria(bateria);
	}

	private void setBateria(Bateria bateria) {
		if (bateria == null)
			throw new IllegalArgumentException("Bateria não pode ser nula");

		this.bateria = bateria;
	}

	public int consultarCarga() {
		return this.bateria.getCarga();
	}

	public void ligar() {
		if (this.bateria.getCarga() == Bateria.MIN_CARGA) {
			System.out.println("Bateria está descarregada.");
			return;
		}
		System.out.println("Celular ligado.");
		this.bateria.consumirBateria(1); // Consome 1% de bateria ao ligar
	}

	public void desligar() {
		System.out.println("Celular desligado.");
	}

	public void recaregar() {
		this.bateria.recarregarBateria();
	}

}
