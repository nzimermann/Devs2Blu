package br.com.exer14.principioDIP;

public class Main {

	public static void main(String[] args) {
		// Questao 1

		MecanismoArmazenamento bd = new BancoDados();
		MecanismoArmazenamento txt = new ArquivoTexto();
		MecanismoArmazenamento excel = new PlanilhaExcel();

		Armazenamento armazenamento1 = new Armazenamento(bd);
		Armazenamento armazenamento2 = new Armazenamento(txt);
		Armazenamento armazenamento3 = new Armazenamento(excel);

		System.out.println(armazenamento1.getDados());
		System.out.println(armazenamento2.getDados());
		System.out.println(armazenamento3.getDados());

		// Questao 2

		Usuario user1 = new Usuario("Felipe");
		Usuario user2 = new Usuario("Joana");

		AutenticacaoUsuario authEmail = new AutenticacaoPorEmail();
		AutenticacaoUsuario authBiometria = new AutenticacaoPorBiometria();

		SistemaAutenticacao sistema = new SistemaAutenticacao(authEmail);
		sistema.autenticarUsuario(user1);

		sistema.setMetodoAutenticacao(authBiometria);
		sistema.autenticarUsuario(user2);

	}

}
