package br.com.exer12.conta;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta("João Silva", 500.0);
		conta.depositar(200.0);
		conta.sacar(150.0);
		conta.gerarRelatorioSaldo();
		conta.getHistoricoTransacao().gerarRelatorioTransacoes();
	}
}
