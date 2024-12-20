package br.com.exer10;

import br.com.exer10.ingresso.*;

public class Questao1Teste {

	public static void main(String[] args) {
		Ingresso i1 = new Normal(100d, "Blumenau");
		Ingresso i2 = new VIP(200d, 100d, "Pomerode");
		Ingresso i3 = new CamaroteInferior(200d, "Timbó");
		Ingresso i4 = new CamaroteSuperior(200d, 50d, "Bluemenau");

		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i3.toString());
		System.out.println(i4.toString());
	}

}
