package br.com.exer13.q1;

public class PagamentoPix extends Pagamento {

	@Override
	public String processarPagamento(double valor) {
		return "Pagemento PIX processado! (R$ "+valor*0.98d+")";
	}

}
