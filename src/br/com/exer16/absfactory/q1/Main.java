package br.com.exer16.absfactory.q1;

import br.com.exer16.absfactory.q1.factory.*;
import br.com.exer16.absfactory.q1.model.Label;
import br.com.exer16.absfactory.q1.model.Textbox;

public class Main {

	public static void main(String[] args) {
		ThemeFactory factory = null;
		Label label = null;
		Textbox textbox = null;

		// Tema escuro
		factory = new DarkThemeFactory();

		label = factory.criarlabel();
		textbox = factory.criarTextbox();

		label.paint();
		textbox.paint();
		
		// Tema claro
		factory = new LightThemeFactory();

		label = factory.criarlabel();
		textbox = factory.criarTextbox();

		label.paint();
		textbox.paint();
	}

}
