package br.com.exer16.absfactory.q2.factory;

import br.com.exer16.absfactory.q2.model.Chart;
import br.com.exer16.absfactory.q2.model.ChartPDF;
import br.com.exer16.absfactory.q2.model.Report;
import br.com.exer16.absfactory.q2.model.ReportPDF;

public class PDFReportFactory extends ReportFactory {

	@Override
	public Report gerarRelatorio() {
		return new ReportPDF();
	}

	@Override
	public Chart gerarGrafico() {
		return new ChartPDF();
	}

}
