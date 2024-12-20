package br.com.exer09.parte2.q3;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {
	private List<Pedido> pedidos;

	public Estabelecimento() {
		super();
		this.pedidos = new ArrayList<Pedido>();
	}

	public void gerarPedido(Cliente cliente, double valorTotal) {
		Pedido pedido = new Pedido(cliente, valorTotal);
		this.pedidos.add(pedido);
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public Pedido getPedido(int index) {
		return this.pedidos.get(index);
	}

	public Pedido getUltimoPedido() {
		return this.pedidos.getLast();
	}

	public void enviarPedido(Pedido pedido) {
		System.out.println("Pedido enviado para: " + pedido.getCliente().getEndereco());
	}

	public void gerarNotaFiscal(Pedido pedido) {
		System.out.println("Nota fiscal gerada para o cliente " + pedido.getCliente().getNome());
	}

}
