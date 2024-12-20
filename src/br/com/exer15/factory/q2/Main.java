package br.com.exer15.factory.q2;

import br.com.exer15.factory.q2.factory.*;
import br.com.exer15.factory.q2.model.*;

public class Main {

	public static void main(String[] args) {
		// Parametros vindos do cliente
		final Double VALOR = 100d;
		final String METODO = "PIX";

		PagamentoFactory factory = null;

		switch (METODO) {
		case "PIX":
			factory = new PagamentoPixFactory();
			break;
		case "PayPal":
			factory = new PagamentoPayPalFactory();
			break;
		case "Cartao":
			factory = new PagamentoCartaoFactory();
			break;
		}

		// Lógica principal
		Pagamento metodoPagamento = factory.criarMetodoPagamento();
		System.out.println(metodoPagamento.processarPagamento(VALOR));
	}

}
