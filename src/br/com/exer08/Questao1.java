package br.com.exer08;

import java.time.LocalTime;
import java.time.LocalDate;

public class Questao1 {

	public class Cliente {
		public String nome;
		public String telefone;
		public int qtdServicoContratado;

		public Cliente(String nome, String telefone) {
			super();
			this.setNome(nome);
			this.setTelefone(telefone);
			this.setQtdServicoContratado(0);
		}

		public void addQtdServicoContratado() {
			this.qtdServicoContratado++;
		}

		public void subQtdServicoContratado() {
			this.qtdServicoContratado--;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public int getQtdServicoContratado() {
			return qtdServicoContratado;
		}

		public void setQtdServicoContratado(int qtdServicoContratado) {
			this.qtdServicoContratado = qtdServicoContratado;
		}
	}

	public class Tema {
		public String nomeTema;
		public String[] itensTema;
		public double valorAluguel;
		public String corToalhaDeMesa;

		public Tema(String nomeTema) {
			this.setNomeTema(nomeTema);
		}

		public Tema(String nomeTema, String[] itens) {
			this.setNomeTema(nomeTema);
			this.setItensTema(itens);
		}

		public Tema(String nomeTema, double valor) {
			this.setNomeTema(nomeTema);
			this.setValorAluguel(valor);
		}

		public Tema(String nomeTema, String[] itens, double valor) {
			this.setNomeTema(nomeTema);
			this.setItensTema(itens);
			this.setValorAluguel(valor);
		}

		public void setItens(String[] itens) {
			this.itensTema = itens;
		}

		public String getNomeTema() {
			return nomeTema;
		}

		public void setNomeTema(String nomeTema) {
			this.nomeTema = nomeTema;
		}

		public String[] getItensTema() {
			return itensTema;
		}

		public void setItensTema(String[] itensTema) {
			this.itensTema = itensTema;
		}

		public double getValorAluguel() {
			return valorAluguel;
		}

		public void setValorAluguel(double valorAluguel) {
			this.valorAluguel = valorAluguel;
		}

		public String getCorToalhaDeMesa() {
			return corToalhaDeMesa;
		}

		public void setCorToalhaDeMesa(String corToalhaDeMesa) {
			this.corToalhaDeMesa = corToalhaDeMesa;
		}
	}

	public class Festa {
		public Tema tema;
		public String endereco;
		public LocalDate dataFesta;
		public LocalTime horaInicio;
		public LocalTime horaFim;
		public double valorCobrado;

		public Festa(Tema tema, String endereco, LocalDate dataFesta, LocalTime horaInicio, LocalTime horaFim) {
			super();
			this.setTema(tema);
			this.setEndereco(endereco);
			this.setDataFesta(dataFesta);
			this.setHoraInicio(horaInicio);
			this.setHoraFim(horaFim);
		}

		public void setValorCobrado(double valor) {
			valorCobrado = valor;
		}

		public void updateItensFesta(String[] itens) {
			tema.setItens(itens);
		}

		public Tema getTema() {
			return tema;
		}

		public void setTema(Tema tema) {
			this.tema = tema;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public LocalDate getDataFesta() {
			return dataFesta;
		}

		public void setDataFesta(LocalDate dataFesta) {
			this.dataFesta = dataFesta;
		}

		public LocalTime getHoraInicio() {
			return horaInicio;
		}

		public void setHoraInicio(LocalTime horaInicio) {
			this.horaInicio = horaInicio;
		}

		public LocalTime getHoraFim() {
			return horaFim;
		}

		public void setHoraFim(LocalTime horaFim) {
			this.horaFim = horaFim;
		}

		public double getValorCobrado() {
			return valorCobrado;
		}
	}

	public class Aluguel {
		public Cliente cliente;
		public Festa festa;
		public double valorCobrado;

		public Aluguel(Cliente cliente, Festa festa) {
			super();
			this.setCliente(cliente);
			this.setFesta(festa);
		}

		public Aluguel(Cliente cliente, Festa festa, double valorCobrado) {
			super();
			this.setCliente(cliente);
			this.setFesta(festa);
			this.setValorCobrado(valorCobrado);
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

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Festa getFesta() {
			return festa;
		}

		public void setFesta(Festa festa) {
			this.festa = festa;
		}

		public double getValorCobrado() {
			return valorCobrado;
		}

		public void setValorCobrado(double valorCobrado) {
			this.valorCobrado = valorCobrado;
		}
	}

}
