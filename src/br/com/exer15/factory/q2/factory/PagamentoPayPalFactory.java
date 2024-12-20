package br.com.exer15.factory.q2.factory;

import br.com.exer15.factory.q2.model.Pagamento;
import br.com.exer15.factory.q2.model.PagamentoPayPal;

public class PagamentoPayPalFactory extends PagamentoFactory {

	@Override
	public Pagamento criarMetodoPagamento() {
		return new PagamentoPayPal();
	}

}
