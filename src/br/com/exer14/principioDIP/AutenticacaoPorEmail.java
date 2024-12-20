package br.com.exer14.principioDIP;

public class AutenticacaoPorEmail implements AutenticacaoUsuario {

	@Override
	public String autenticar(Usuario usuario) {
		return "Usuário " + usuario.getNome() + " autenticado";
	}

}
