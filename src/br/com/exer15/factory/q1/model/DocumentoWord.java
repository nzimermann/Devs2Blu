package br.com.exer15.factory.q1.model;

public class DocumentoWord implements Documento {

	@Override
	public void abrir() {
		System.out.println("Este é um documento Word");
	}

}
