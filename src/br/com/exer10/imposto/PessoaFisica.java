package br.com.exer10.imposto;

public class PessoaFisica extends Contribuinte {
	private String cpf;

	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if (renda > 3600)
			return 700d;
		if (renda > 2800)
			return 500d;
		if (renda > 2100)
			return 270d;
		if (renda > 1400)
			return 100d;
		return 0d;
	}

}
