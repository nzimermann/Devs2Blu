package br.com.exer13;

public class DescontoRoupa implements Desconto {

	public double calcularDesconto(Produto produto) {
		return produto.getPreco() * 0.15;
	}

}
