package br.com.exer15.factory.q1.factory;

import br.com.exer15.factory.q1.model.Documento;
import br.com.exer15.factory.q1.model.DocumentoWord;

public class DocumentoWordFactory extends DocumentoFactory {

	@Override
	public Documento criarDocumento() {
		return new DocumentoWord();
	}
	
}