package br.com.exer10.imposto;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;

	public Contribuinte(String nome, double rendaBruta) {
		this.setNome(nome);
		this.setRendaBruta(rendaBruta);
	}

	public abstract double calcularImposto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

}
