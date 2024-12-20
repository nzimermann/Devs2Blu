package br.com.exer18.memento.q1.swing.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Caretaker {
	public static final int LIMITE = 5;
	private List<Memento> mementos = new ArrayList<Memento>();
	
	public List<Memento> getHistoryList() {
	      return Collections.unmodifiableList(mementos);
	}
	
	public void add(Memento memento) {
		if (mementos.size() >= LIMITE) {
			mementos.removeFirst();
		}
		mementos.add(memento);			
	}
	
	public Memento get(int index) {
		if (index >= LIMITE)
			return mementos.get(LIMITE-1);
		return mementos.get(index);
	}
}
