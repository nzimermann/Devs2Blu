package br.com.exer18.memento.q2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.exer18.memento.q2.component.OperationWithMemory;
import br.com.exer18.memento.q2.component.OperationWithMemory.OperationMemento;
import br.com.exer18.memento.q2.memory.Caretaker;

public class CalculadoraMemento {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculadora Memento");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel labelNumero1 = new JLabel("Número 1: ");
		JTextField campoNumero1 = new JTextField();
		JLabel labelNumero2 = new JLabel("Número 2: ");
		JTextField campoNumero2 = new JTextField();
		JButton btnAdicao = new JButton("+");
		JButton btnSubtracao = new JButton("-");
		JButton btnMultiplicacao = new JButton("*");
		JButton btnDivisao = new JButton("/");
		JLabel labelResultado = new JLabel("Resultado: ");

		JButton previous = new JButton("<<");
		JButton next = new JButton(">>");

		// Elementos do Memento
		OperationWithMemory originator = new OperationWithMemory(campoNumero1, campoNumero2, labelResultado);
		Caretaker caretaker = new Caretaker();

		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(campoNumero1.getText());
					double num2 = Double.parseDouble(campoNumero2.getText());
					double resultado = 0;
					String operacao = e.getActionCommand();

					switch (operacao) {
					case "+":
						resultado = num1 + num2;
						break;
					case "-":
						resultado = num1 - num2;
						break;
					case "*":
						resultado = num1 * num2;
						break;
					case "/":
						if (num2 != 0) {
							resultado = num1 / num2;
						} else {
							labelResultado.setText("Erro: Divisão por zero");
							return;
						}
						break;
					default:
						labelResultado.setText("Operação desconhecida");
						return;
					}
					labelResultado.setText("Resultado: " + resultado);
					caretaker.add(originator.save());
				} catch (NumberFormatException ex) {
					labelResultado.setText("Erro: Entrada inválida");
				}
			}
		};

		btnAdicao.addActionListener(actionListener);
		btnSubtracao.addActionListener(actionListener);
		btnMultiplicacao.addActionListener(actionListener);
		btnDivisao.addActionListener(actionListener);
		
		previous.addActionListener(e -> {
			OperationMemento memento = (OperationMemento) caretaker.undo();
			if (memento != null)
				originator.restore(memento);
		});

		next.addActionListener(e -> {
			OperationMemento memento = (OperationMemento) caretaker.redo();
			if (memento != null)
				originator.restore(memento);
		});

		// Configuração do layout (chatGPT)
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
        	layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(labelNumero1)
                    .addComponent(campoNumero1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(labelNumero2)
                    .addComponent(campoNumero2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnAdicao)
                    .addComponent(btnSubtracao)
                    .addComponent(btnMultiplicacao)
                    .addComponent(btnDivisao))
                .addComponent(labelResultado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                	.addComponent(previous)
        			.addComponent(next))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero1)
                    .addComponent(campoNumero1))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero2)
                    .addComponent(campoNumero2))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicao)
                    .addComponent(btnSubtracao)
                    .addComponent(btnMultiplicacao)
                    .addComponent(btnDivisao))
                .addComponent(labelResultado)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                	.addComponent(previous)
        			.addComponent(next))
        );

		
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}
