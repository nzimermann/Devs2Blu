package br.com.exer12.conta;

public interface ContaBancaria {
	
	double obterSaldo();
	void sacar(double valor);
	void depositar(double valor);

}
