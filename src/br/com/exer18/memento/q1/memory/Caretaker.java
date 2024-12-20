package br.com.exer18.memento.q1.memory;

import java.util.ArrayList;
import java.util.List;

import br.com.exer18.memento.q1.component.TextEditor;

public class Caretaker {
	private List<TextEditor.Memento> savedStates = new ArrayList<>();

	// Adiciona um novo memento à lista
	public void addMemento(TextEditor.Memento memento) {
		savedStates.add(memento);
	}

	// Recupera o último memento salvo e remove-o da lista
	public TextEditor.Memento getLastMemento() {
		if (savedStates.size() > 0) {
			return savedStates.remove(savedStates.size() - 1);
		}
		return null;
	}
}