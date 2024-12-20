package br.com.exer17.bridge.q1.formas;

import br.com.exer17.bridge.q1.cores.Cor;
import br.com.exer17.bridge.q1.estilos.Estilo;

//Abstra��o
public abstract class Forma {
	protected Cor cor;
	protected Estilo estilo;

	// Construtor que recebe uma implementa��o de cor
	protected Forma(Cor cor, Estilo estilo) {
		this.cor = cor;
		this.estilo = estilo;
	}

	public abstract void desenhar();
}
