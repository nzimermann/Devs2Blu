package br.com.exer14.principioISP;

public class NotificacaoEmail implements NotificaEmail {

	public void enviarEmail() {
		System.out.println("Enviando notificação por e-mail.");
	}

}
