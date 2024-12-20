package br.com.exer17.bridge.q2.empregados;

import br.com.exer17.bridge.q2.formatos.Formato;

public abstract class Empregado {
	public String nome;
	public Integer idade;
	public Double salario;
	protected Formato formato;
	
	public Empregado(String nome, Integer idade, Double salario, Formato formato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.formato = formato;
	}
	
	public abstract String exportar();

}
