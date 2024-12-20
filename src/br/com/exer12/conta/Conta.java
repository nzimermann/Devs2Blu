package br.com.exer12.conta;

public class Conta implements ContaBancaria {
    private String titular;
    private HistoricoTransacao transacoes;
    
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.transacoes = new HistoricoTransacao(saldoInicial);
    }
    
    public void gerarRelatorioSaldo() {
        System.out.println("Relatório de Saldo");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + this.obterSaldo());
    }

	@Override
	public double obterSaldo() {
		return this.transacoes.getSaldo();
	}

	@Override
	public void sacar(double valor) {
		this.transacoes.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		this.transacoes.depositar(valor);
	}
	
	public HistoricoTransacao getHistoricoTransacao() {
		return this.transacoes;
	}
}
