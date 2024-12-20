package br.com.exer15.factory.q2.model;

public class PagamentoPayPal implements Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento PIX processado! (R$ "+valor*0.98d+")";
	}
	
}
