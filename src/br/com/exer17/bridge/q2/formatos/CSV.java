package br.com.exer17.bridge.q2.formatos;

import br.com.exer17.bridge.q2.empregados.Empregado;

public class CSV implements Formato {

	@Override
	public String converter(Empregado empregado) {
		String csv = "nome,idade,salario\n";
		csv += empregado.nome+",";
		csv += empregado.idade+",";
		csv += empregado.salario;
		return csv;
	}

}
