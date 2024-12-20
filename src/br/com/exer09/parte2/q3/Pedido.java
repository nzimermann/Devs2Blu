package br.com.exer09.parte2.q3;

class Pedido {
	private Cliente cliente;
	private double valorTotal;

	public Pedido(Cliente cliente, double valorTotal) {
		this.cliente = cliente;
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

}
