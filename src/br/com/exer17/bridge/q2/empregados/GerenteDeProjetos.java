package br.com.exer17.bridge.q2.empregados;

import br.com.exer17.bridge.q2.formatos.Formato;

public class GerenteDeProjetos extends Empregado {

	public GerenteDeProjetos(String nome, Integer idade, Double salario, Formato formato) {
		super(nome, idade, salario, formato);
	}
	
	@Override
	public String exportar() {
		return formato.converter(this);
	}

}
