package br.com.exer07.teste;

import java.sql.Date;
import java.time.LocalTime;

import br.com.exer07.Questao1;

public class TesteQuestao1 {
	public static void main(String[] args) {
		Questao1.Cliente cliente  = new Questao1().new Cliente("John", "123456789");
		Questao1.Tema tema = new Questao1().new Tema("Princesa", 500d);
		Questao1.Festa festa = new Questao1().new Festa(tema, "Rua Fulano de Tal", Date.valueOf("2023-09-30"), LocalTime.of(18, 0),
				LocalTime.of(22, 0));
		Questao1.Aluguel aluguel = new Questao1().new Aluguel(cliente, festa);
		
		System.out.println(cliente.nome);
		System.out.println(cliente.telefone);
		
		System.out.println(tema.nomeTema);
		System.out.println(tema.valorAluguel);
		
		System.out.println(festa.endereco);
		System.out.println(festa.valorCobrado);
		
		System.out.println(aluguel.calcularValorCobrado());
		System.out.println(aluguel.cliente.nome);
	}

}
