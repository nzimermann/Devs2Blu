package br.com.exer14.principioDIP;

public class ArquivoTexto implements MecanismoArmazenamento {
	
	@Override
	public String getDados() {
		return "Dados do arquivo de texto";
	}

}
