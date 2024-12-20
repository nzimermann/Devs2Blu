package br.com.exer17.bridge.q2.formatos;

import br.com.exer17.bridge.q2.empregados.Empregado;

public class JSON implements Formato {

	@Override
	public String converter(Empregado empregado) {
		String json = "{'nome':'"+empregado.nome+"',";
		json += "'idade':'"+empregado.idade+"',";
		json += "'idade':'"+empregado.salario+"'}";
		return json;
	}

}
