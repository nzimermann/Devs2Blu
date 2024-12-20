package br.com.exer15.factory.q2.factory;

import br.com.exer15.factory.q2.model.Pagamento;
import br.com.exer15.factory.q2.model.PagamentoCartao;

public class PagamentoCartaoFactory extends PagamentoFactory {

	@Override
	public Pagamento criarMetodoPagamento() {
		return new PagamentoCartao();
	}

}
