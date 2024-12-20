package br.com.exer09.parte1;

import java.time.LocalTime;
import java.time.LocalDate;

public class Questao1 {

	public class Cliente {
		private String nome;
		private String telefone;
		private int qtdServicoContratado;

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
		private String nomeTema;
		private String[] itensTema;
		private double valorAluguel;
		private String corToalhaDeMesa;

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
		private Tema tema;
		private Endereco endereco;
		private LocalDate dataFesta;
		private LocalTime horaInicio;
		private LocalTime horaFim;
		private double valorCobrado;

		public Festa(Tema tema, Endereco endereco, LocalDate dataFesta, LocalTime horaInicio, LocalTime horaFim) {
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

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
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
		private Cliente cliente;
		private Festa festa;
		private double valorCobrado;

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

	public class Endereco {
		private String estado;
		private String cidade;
		private String bairro;
		private String rua;
		private String numero;
		private String complemento;

		public Endereco(String estado, String cidade, String bairro, String rua, String numero, String complemento) {
			super();
			this.setEstado(estado);
			this.setCidade(cidade);
			this.setBairro(bairro);
			this.setRua(rua);
			this.setNumero(numero);
			this.setComplemento(complemento);
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String toString() {
			return "Endereco [estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua
					+ ", numero=" + numero + ", complemento=" + complemento + "]";
		}
	}
}
