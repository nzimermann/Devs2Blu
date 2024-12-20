package br.com.exer17.bridge.q1.formas;

import br.com.exer17.bridge.q1.cores.Cor;
import br.com.exer17.bridge.q1.estilos.Estilo;

public class Triangulo extends Forma {

	public Triangulo(Cor cor, Estilo estilo) {
		super(cor, estilo);
	}

	@Override
	public void desenhar() {
		System.out.print("Desenhando um triângulo com ");
		cor.aplicarCor();
	}

}
