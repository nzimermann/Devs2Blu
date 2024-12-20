package br.com.exer14.principioDIP;

public class BancoDados implements MecanismoArmazenamento {

	@Override
	public String getDados() {
		return "Dados do banco de dados";
	}

}
