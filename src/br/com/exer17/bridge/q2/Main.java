package br.com.exer17.bridge.q2;

import br.com.exer17.bridge.q2.empregados.*;
import br.com.exer17.bridge.q2.formatos.*;

public class Main {
	
	public static void main(String[] args) {
		Formato csv = new CSV();
		Formato json = new JSON();
		
		Empregado gerente = new GerenteDeProjetos("Fábio", 31, 2500d, csv);
		Empregado analista = new Analista("Ana", 28, 3000d, json);
		Empregado secretaria = new Secretaria("Lucas", 25, 1000d, json);
		
		System.out.println(gerente.exportar());
		System.out.println(analista.exportar());
		System.out.println(secretaria.exportar());
	}

}
