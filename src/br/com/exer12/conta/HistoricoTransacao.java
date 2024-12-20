package br.com.exer12.conta;

import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacao {
	private double saldo;
	private List<String> transacoes;

	public HistoricoTransacao(double saldoInicial) {
		this.transacoes = new ArrayList<>();
		this.setSaldo(saldoInicial);
		transacoes.add("Conta criada com saldo inicial de: " + saldoInicial);
	}

	private void setSaldo(double valor) {
		if (valor <= 0)
			throw new IllegalArgumentException("Valor inicial deve ser positivo.");
		this.saldo = valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			transacoes.add("Saque de: " + valor);
		} else {
			transacoes.add("Tentativa de saque sem saldo suficiente: " + valor);
		}
	}

	public void depositar(double valor) {
		saldo += valor;
		transacoes.add("Depósito de: " + valor);
	}

	public void gerarRelatorioTransacoes() {
		System.out.println("Relatório de Transações");
		for (String transacao : transacoes) {
			System.out.println(transacao);
		}
	}
}
