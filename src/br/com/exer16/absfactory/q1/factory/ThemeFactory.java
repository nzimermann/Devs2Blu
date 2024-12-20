package br.com.exer16.absfactory.q1.factory;

import br.com.exer16.absfactory.q1.model.Label;
import br.com.exer16.absfactory.q1.model.Textbox;

public abstract class ThemeFactory {
	
	public abstract Textbox criarTextbox();
	
	public abstract Label criarlabel();

}
