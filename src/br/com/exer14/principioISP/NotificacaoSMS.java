package br.com.exer14.principioISP;

public class NotificacaoSMS implements NotificaSMS {

	public void enviarSMS() {
		System.out.println("Enviando notificação por SMS.");
	}

}
