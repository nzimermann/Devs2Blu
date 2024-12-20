package br.com.exer16.absfactory.q2.factory;

import br.com.exer16.absfactory.q2.model.Chart;
import br.com.exer16.absfactory.q2.model.ChartHTML;
import br.com.exer16.absfactory.q2.model.Report;
import br.com.exer16.absfactory.q2.model.ReportHTML;

public class HTMLReportFactory extends ReportFactory {

	@Override
	public Report gerarRelatorio() {
		return new ReportHTML();
	}

	@Override
	public Chart gerarGrafico() {
		return new ChartHTML();
	}

}
