package br.com.exer18.memento.q1;

import br.com.exer18.memento.q1.component.TextEditor;
import br.com.exer18.memento.q1.memory.Caretaker;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Vers�o 1");
        caretaker.addMemento(editor.saveToMemento());
        
        editor.setText("Vers�o 2");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Vers�o 3");
        
        System.out.println("Texto atual: " + editor.getText());  // Exibe "Vers�o 3"

        // Desfazendo duas vezes
        editor.restoreFromMemento(caretaker.getLastMemento());
        System.out.println("Ap�s desfazer uma vez: " + editor.getText());  // Exibe "Vers�o 2"

       editor.restoreFromMemento(caretaker.getLastMemento());
       System.out.println("Ap�s desfazer duas vezes: " + editor.getText());  // Exibe "Vers�o 1"
    }
}
