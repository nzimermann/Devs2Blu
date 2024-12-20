package br.com.exer16.absfactory.q2.factory;

import br.com.exer16.absfactory.q2.model.Chart;
import br.com.exer16.absfactory.q2.model.Report;

public abstract class ReportFactory {

	public abstract Report gerarRelatorio();
	
	public abstract Chart gerarGrafico();

}
