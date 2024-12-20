package br.com.exer13;

public class DescontoLimpeza implements Desconto {

	@Override
	public double calcularDesconto(Produto produto) {
		return produto.getPreco() * 0.25;
	}

}
