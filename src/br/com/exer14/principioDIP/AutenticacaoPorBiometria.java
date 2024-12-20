package br.com.exer14.principioDIP;

public class AutenticacaoPorBiometria implements AutenticacaoUsuario {

	@Override
	public String autenticar(Usuario usuario) {
		return "Usuário " + usuario.getNome() + " autenticado";
	}

}
