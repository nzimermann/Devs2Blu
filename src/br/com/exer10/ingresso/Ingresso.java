package br.com.exer10.ingresso;

public abstract class Ingresso {
	private double valor;
	private String localizacao;
	private double valorAdicional;

	public Ingresso(double valor, String localizacao) {
		this.setValor(valor);
		this.setValorAdicional(0);
		this.setLocalizacao(localizacao);
	}

	public Ingresso(double valor, double valorAdicional, String localizacao) {
		this.setValor(valor);
		this.setValorAdicional(valorAdicional);
		this.setLocalizacao(localizacao);
	}

	public void imprimeValor() {
		System.out.println("Valor: " + this.getValor());
	}

	abstract String getTipo();

	public void imprimeTipo() {
		System.out.println("Tipo: " + this.getTipo());
	}

	public double valorTotal() {
		return this.getValor() + this.getValorAdicional();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public String toString() {
		return "Ingresso [tipo=" + getTipo() + ", valor=" + getValor() + ", valorAdicional=" + getValorAdicional()
				+ ", valorTotal=" + valorTotal() + "]";
	}

}
