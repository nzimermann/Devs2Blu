package br.com.exer15.factory.q2.factory;

import br.com.exer15.factory.q2.model.Pagamento;
import br.com.exer15.factory.q2.model.PagamentoPix;

public class PagamentoPixFactory extends PagamentoFactory {

	@Override
	public Pagamento criarMetodoPagamento() {
		return new PagamentoPix();
	}

}
