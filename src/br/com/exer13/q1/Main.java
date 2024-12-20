package br.com.exer13.q1;

public class Main {

	public static void main(String[] args) {
		Pagamento pc = new PagamentoCartao();
		Pagamento pp = new PagamentoPix();
		System.out.println(pc.processarPagamento(100d));
		System.out.println(pp.processarPagamento(100d));
	}

}
