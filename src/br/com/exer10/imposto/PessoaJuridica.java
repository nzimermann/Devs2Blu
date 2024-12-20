package br.com.exer10.imposto;

public class PessoaJuridica extends Contribuinte {
	public static final double IMPOSTO_RENDA = 0.1d;
	private String cnpj;

	public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
		super(nome, rendaBruta);
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * IMPOSTO_RENDA;
	}

}
