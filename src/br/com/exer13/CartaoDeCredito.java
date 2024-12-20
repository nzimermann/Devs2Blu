package br.com.exer13;

public class CartaoDeCredito implements Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento cartão de crédito processado! (R$ "+valor+")";
	}

}
