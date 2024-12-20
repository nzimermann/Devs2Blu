package br.com.exer18.memento.q2.component;

import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.exer18.memento.q2.memory.Memento;

public class OperationWithMemory {
	private JTextField campoNumero1;
	private JTextField campoNumero2;
	private JLabel labelResultado;

	public OperationWithMemory(JTextField number1, JTextField number2, JLabel result) {
		super();
		this.campoNumero1 = number1;
		this.campoNumero2 = number2;
		this.labelResultado = result;
	}

	public OperationMemento save() {
		return new OperationMemento(campoNumero1.getText(), campoNumero2.getText(), labelResultado.getText());
	}

	public void restore(OperationMemento memento) {
        campoNumero1.setText(memento.getNumero1State());
        campoNumero2.setText(memento.getNumero2State());
        labelResultado.setText(memento.getResultState());
	}

	public static class OperationMemento implements Memento {
		private String number1;
		private String number2;
		private String result;

		public OperationMemento(String number1, String number2, String result) {
			super();
			this.number1 = number1;
			this.number2 = number2;
			this.result = result;
		}

		private String getNumero1State() {
			return number1;
		}

		private String getNumero2State() {
			return number2;
		}

		private String getResultState() {
			return result;
		}
	}
}
