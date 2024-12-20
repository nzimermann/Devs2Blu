package br.com.exer07;

import java.time.LocalTime;
import java.sql.Date;

public class Questao1 {

	public class Cliente {
		public String nome;
		public String telefone;
		public int qtdServicoContratado;

		public Cliente(String nome, String telefone) {
			super();
			this.nome = nome;
			this.telefone = telefone;
			this.qtdServicoContratado = 0;
		}

		public void addQtdServicoContratado() {
			this.qtdServicoContratado++;
		}

		public void subQtdServicoContratado() {
			this.qtdServicoContratado--;
		}
	}

	public class Tema {
		public String nomeTema;
		public String[] itensTema;
		public double valorAluguel;
		public String corToalhaDeMesa;

		public Tema(String nomeTema) {
			this.nomeTema = nomeTema;
		}

		public Tema(String nomeTema, String[] itens) {
			this.nomeTema = nomeTema;
			this.itensTema = itens;
		}

		public Tema(String nomeTema, double valor) {
			this.nomeTema = nomeTema;
			this.valorAluguel = valor;
		}

		public Tema(String nomeTema, String[] itens, double valor) {
			this.nomeTema = nomeTema;
			this.itensTema = itens;
			this.valorAluguel = valor;
		}

		public void setItens(String[] itens) {
			this.itensTema = itens;
		}
	}

	public class Festa {
		public Tema tema;
		public String endereco;
		public Date dataFesta;
		public LocalTime horaInicio;
		public LocalTime horaFim;
		public double valorCobrado;

		public Festa(Tema tema, String endereco, Date dataFesta, LocalTime horaInicio, LocalTime horaFim) {
			super();
			this.tema = tema;
			this.endereco = endereco;
			this.dataFesta = dataFesta;
			this.horaInicio = horaInicio;
			this.horaFim = horaFim;
		}

		public void setValorCobrado(double valor) {
			valorCobrado = valor;
		}

		public void updateItensFesta(String[] itens) {
			tema.setItens(itens);
		}
	}

	public class Aluguel {
		public Cliente cliente;
		public Festa festa;
		public double valorCobrado;

		public Aluguel(Cliente cliente, Festa festa) {
			super();
			this.cliente = cliente;
			this.festa = festa;
		}

		public Aluguel(Cliente cliente, Festa festa, double valorCobrado) {
			super();
			this.cliente = cliente;
			this.festa = festa;
			this.valorCobrado = valorCobrado;
		}

		public void concluirServico() {
			this.cliente.addQtdServicoContratado();
		}

		public void updateValorCobrado(double valorCobrado) {
			this.valorCobrado = valorCobrado;
		}

		public double calcularValorCobrado() {
			if (this.cliente.qtdServicoContratado > 10)
				return this.festa.tema.valorAluguel * 0.8d;

			if (this.cliente.qtdServicoContratado > 5)
				return this.festa.tema.valorAluguel * 0.9d;

			return this.festa.tema.valorAluguel;
		}
	}

}
