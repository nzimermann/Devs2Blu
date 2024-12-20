package br.com.exer14.principioDIP;

public class SistemaAutenticacao {
	AutenticacaoUsuario autenticacao;

	public SistemaAutenticacao(AutenticacaoUsuario autenticacao) {
		this.setMetodoAutenticacao(autenticacao);
	}

	public void autenticarUsuario(Usuario usuario) {
		String msg = this.autenticacao.autenticar(usuario);
		System.out.println(msg);
	}

	public void setMetodoAutenticacao(AutenticacaoUsuario autenticacao) {
		this.autenticacao = autenticacao;
	}

}
