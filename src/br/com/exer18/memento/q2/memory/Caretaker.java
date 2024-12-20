package br.com.exer18.memento.q2.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Caretaker {
	private List<Memento> undo = new ArrayList<Memento>();
	private List<Memento> redo = new ArrayList<Memento>();
	private Memento mementoAtual = null;

	public List<Memento> getUndoList() {
		return Collections.unmodifiableList(undo);
	}
	
	public List<Memento> getRedoList() {
		return Collections.unmodifiableList(redo);
	}
	
    public void add(Memento memento) {
    	if (mementoAtual != null)
    		undo.add(mementoAtual);
    	mementoAtual = memento;
        redo.clear();
    }
    
    public Memento undo() {
        if (undo.isEmpty())
        	return null;
        redo.add(mementoAtual);
        mementoAtual = undo.removeLast();
        return mementoAtual;
    }

    public Memento redo() {
        if (redo.isEmpty())
        	return null;
        undo.add(mementoAtual);
        mementoAtual = redo.removeLast();
        return mementoAtual;
    }
}
