package br.com.exer16.absfactory.q1.factory;

import br.com.exer16.absfactory.q1.model.DarkLabel;
import br.com.exer16.absfactory.q1.model.DarkTextbox;
import br.com.exer16.absfactory.q1.model.Label;
import br.com.exer16.absfactory.q1.model.Textbox;

public class DarkThemeFactory extends ThemeFactory {

	@Override
	public Textbox criarTextbox() {
		return new DarkTextbox();
	}

	@Override
	public Label criarlabel() {
		return new DarkLabel();
	}

}
