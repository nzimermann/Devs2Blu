package br.com.exer13.q1;

public class PagamentoCartao extends Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento Cartão processado! (R$ "+valor+")";
	}

}
