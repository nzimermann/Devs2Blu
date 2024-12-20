package br.com.exer15.factory.q1.model;

public class DocumentoPDF implements Documento {

	@Override
	public void abrir() {
		System.out.println("Este é um documento PDF");
	}

}
