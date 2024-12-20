package br.com.exer16.absfactory.q2;

import br.com.exer16.absfactory.q2.factory.*;
import br.com.exer16.absfactory.q2.model.*;

public class Main {
	
	public static void main(String[] args) {
		ReportFactory factory = null;
		Chart grafico = null;
		Report relatorio = null;
		
		// HTML
		factory = new HTMLReportFactory();
		grafico = factory.gerarGrafico();
		relatorio = factory.gerarRelatorio();
		
		grafico.exibir();
		System.out.println(relatorio.getRelatorio());
		
		// PDF
		factory = new PDFReportFactory();
		grafico = factory.gerarGrafico();
		relatorio = factory.gerarRelatorio();
		
		grafico.exibir();
		System.out.println(relatorio.getRelatorio());
	}

}
