package br.com.exer17.bridge.q1.formas;

import br.com.exer17.bridge.q1.cores.Cor;
import br.com.exer17.bridge.q1.estilos.Estilo;

//Abstra��o Refinada para um Quadrado
public class Quadrado extends Forma {
	public Quadrado(Cor cor, Estilo estilo) {
		super(cor, estilo);
	}

	@Override
	public void desenhar() {
		System.out.print("Desenhando um quadrado com ");
		cor.aplicarCor();
	}

}
