package br.com.exer16.absfactory.q1.factory;

import br.com.exer16.absfactory.q1.model.LightLabel;
import br.com.exer16.absfactory.q1.model.LightTextbox;
import br.com.exer16.absfactory.q1.model.Label;
import br.com.exer16.absfactory.q1.model.Textbox;

public class LightThemeFactory extends ThemeFactory {

	@Override
	public Textbox criarTextbox() {
		return new LightTextbox();
	}

	@Override
	public Label criarlabel() {
		return new LightLabel();
	}

}
