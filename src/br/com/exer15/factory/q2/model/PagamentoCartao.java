package br.com.exer15.factory.q2.model;

public class PagamentoCartao implements Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento Cartão processado! (R$ "+valor+")";
	}

}
