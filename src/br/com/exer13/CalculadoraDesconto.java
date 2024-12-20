package br.com.exer13;

import java.util.List;

public class CalculadoraDesconto {

	public double calcularDesconto(Produto produto, Desconto desconto) {
		return desconto.calcularDesconto(produto);
	}

	public double calcularDescontoTotal(List<Produto> produtos, List<Desconto> descontos) {
		double totalDesconto = 0;
		for (int i = 0; i < produtos.size(); i++) {
			totalDesconto += descontos.get(i).calcularDesconto(produtos.get(i));
		}
		return totalDesconto;
	}

}
