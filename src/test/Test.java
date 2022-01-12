package test;

import mementoPattern.HistoryLog;
import mementoPattern.TextEditor;

public class Test {

    public static void main(String[] args) {

        ///
        System.out.println("\nCreate an instance of the TextEditor");
        System.out.println("Create an instance of HistoryLog");
        ///
        TextEditor textEditor = new TextEditor();
        HistoryLog historyLog = new HistoryLog();


        ///
        System.out.println("\nSet your content and create a memento");
        System.out.println("Send the state of your text editor to the HistoryLog");
        ///
        textEditor.setContent("Hello world");
        historyLog.push(textEditor.createMemento());

        textEditor.setContent("What's up world?");
        historyLog.push(textEditor.createMemento());

        textEditor.setContent("Bye bye world");
        historyLog.push(textEditor.createMemento());


        ///
        System.out.println("\nPrint the current logs");
        ///
        historyLog.printLog();


        ///
        System.out.println("\nRestore the before-last state and print to your text editor to validate the action");
        ///
        textEditor.restore(historyLog.pop());
        System.out.println(textEditor.toString());


        ///
        System.out.println("\nPrint the current logs");
        ///
        historyLog.printLog();




    }
}
