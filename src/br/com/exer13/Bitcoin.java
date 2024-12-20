package br.com.exer13;

public class Bitcoin implements Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento Bitcoin processado! (R$ " + valor * 0.98d + ")";
	}

}
