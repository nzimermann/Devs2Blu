package br.com.exer13;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Desconto dl = new DescontoLimpeza();
		Produto pl = new Produto("Limpeza", 100d);

		List<Produto> listaProdutos = new ArrayList<Produto>();
		List<Desconto> listaDescontos = new ArrayList<Desconto>();

		listaProdutos.add(new Produto("Alimento", 100d));
		listaProdutos.add(new Produto("EletroDomestico", 100d));
		listaProdutos.add(new Produto("Eletronico", 100d));
		listaProdutos.add(pl);
		listaProdutos.add(new Produto("Roupa", 100d));
		listaDescontos.add(new DescontoAlimento());
		listaDescontos.add(new DescontoEletroDomestico());
		listaDescontos.add(new DescontoEletronico());
		listaDescontos.add(dl);
		listaDescontos.add(new DescontoRoupa());

		CalculadoraDesconto calc = new CalculadoraDesconto();
		System.out.println(calc.calcularDesconto(pl, dl));
		System.out.println(calc.calcularDescontoTotal(listaProdutos, listaDescontos));

		Pagamento p1 = new CartaoDeCredito();
		Pagamento p2 = new PayPal();
		Pagamento p3 = new Bitcoin();

		System.out.println(p1.processarPagamento(100d));
		System.out.println(p2.processarPagamento(100d));
		System.out.println(p3.processarPagamento(100d));
	}

}
