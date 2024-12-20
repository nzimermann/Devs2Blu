package br.com.exer11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1Menu {
	private static Scanner sc = new Scanner(System.in);
	private static List<Professor> professores = new ArrayList<>();
	private static List<ProjetoPesquisa> projetos = new ArrayList<>();

	public static void main(String[] args) {
		cadastraProfessores(); // professores pré-cadastrados
		exibirMenu();
	}

	private static void cadastraProfessores() {
		professores.add(new Professor("Roberto"));
		professores.add(new Professor("Antônio"));
		professores.add(new Professor("Luciana"));
	}

	private static void exibirMenu() {
		while (true) {
			System.out.println("1 - CADASTRAR UM PROJETO E UM INTEGRANTE NA EQUIPE");
			System.out.println("2 - CADASTRAR UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
			System.out.println("3 - CADASTRAR MAIS DE UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
			System.out.println("4 - EXIBIR PROJETOS CADASTRADOS");
			System.out.println("0 - SAIR");
			System.out.print(": ");
			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				cadastrarProjetoComUmIntegrante();
				break;
			case 2:
				cadastrarProjetoComVariosMembros();
				break;
			case 3:
				cadastrarVariosProjetos();
				break;
			case 4:
				exibirProjetos();
				break;
			case 0:
				System.out.println("Encerrando...");
				return;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	private static void cadastrarProjetoComUmIntegrante() {
		ProjetoPesquisa projeto = criarProjeto();
		System.out.println("Adicionando um integrante à equipe.");
		Pesquisador membro = criarPesquisador();
		projeto.addMembroEquipe(membro);
		projetos.add(projeto);
		System.out.println("Projeto cadastrado com sucesso!");
	}

	private static void cadastrarProjetoComVariosMembros() {
		ProjetoPesquisa projeto = criarProjeto();
		System.out.println("Quantos membros deseja adicionar?");
		int quantidade = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantidade; i++) {
			Pesquisador membro = criarPesquisador();
			projeto.addMembroEquipe(membro);
		}
		projetos.add(projeto);
		System.out.println("Projeto cadastrado com sucesso!");
	}

	private static void cadastrarVariosProjetos() {
		System.out.println("Quantos projetos deseja cadastrar?");
		int quantidade = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantidade; i++) {
			cadastrarProjetoComVariosMembros();
		}
	}

	private static ProjetoPesquisa criarProjeto() {
		System.out.print("Código do projeto: ");
		String codigo = sc.nextLine();
		System.out.print("Título do projeto: ");
		String titulo = sc.nextLine();

		int escolha;
		do {
			System.out.println("Escolha o professor responsável:");
			for (int i = 0; i < professores.size(); i++) {
				System.out.println((i + 1) + " - " + professores.get(i).getNome());
			}
			escolha = sc.nextInt() - 1;
			sc.nextLine();
		} while (escolha < 0 || escolha >= professores.size());

		return new ProjetoPesquisa(codigo, titulo, professores.get(escolha));
	}

	private static Pesquisador criarPesquisador() {
		System.out.println("Escolha o tipo de integrante:");
		System.out.println("1 - Professor");
		System.out.println("2 - Aluno");
		int escolha = sc.nextInt();
		sc.nextLine();

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		if (escolha == 1) {
			return new Professor(nome);
		} else {
			return new Aluno(nome);
		}
	}

	private static void exibirProjetos() {
		if (projetos.size() == 0)
			System.out.println("Não existem projetos cadastrados.");
		System.out.println("===");
		for (ProjetoPesquisa projeto : projetos) {
			System.out.println("Título: " + projeto.getTitulo() + " (cód. " + projeto.getCodigo() + ")");
			System.out.println(projeto.getInfoParticipantes());
		}
	}
}
