package br.com.exer15.factory.q1;

import br.com.exer15.factory.q1.factory.DocumentoFactory;
import br.com.exer15.factory.q1.factory.DocumentoPDFFactory;
import br.com.exer15.factory.q1.factory.DocumentoWordFactory;
import br.com.exer15.factory.q1.model.Documento;

public class Cliente {
	
	public static void main(String[] args) {
		DocumentoFactory factory = null;
		Documento documento = null;
		
		// Se o cliente escolher word
		factory = new DocumentoWordFactory();
		documento = factory.criarDocumento();
		documento.abrir();
		
		// Se o cliente escolher pdf
		factory = new DocumentoPDFFactory();
		documento = factory.criarDocumento();
		documento.abrir();
	}
}
