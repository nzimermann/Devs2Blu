package br.com.exer14.principioISP;

public class Main {
	public static void main(String[] args) {

		ImpressoraBasica impressora = new ImpressoraBasica();

		impressora.imprimirTexto();

		NotificacaoEmail nEmail = new NotificacaoEmail();
		NotificacaoSMS nSMS = new NotificacaoSMS();

		nEmail.enviarEmail();
		nSMS.enviarSMS();

	}
}
