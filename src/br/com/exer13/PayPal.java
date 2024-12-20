package br.com.exer13;

public class PayPal implements Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento PayPal processado! (R$ " + valor * 0.99d + ")";
	}

}
