package br.com.exer14.principioDIP;

public class PlanilhaExcel implements MecanismoArmazenamento {
	
	@Override
	public String getDados() {
		return "Dados do arquivo de excel";
	}

}
