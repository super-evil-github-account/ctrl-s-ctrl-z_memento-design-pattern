package mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class HistoryLog {

    private List<Memento> states;

    public HistoryLog(){
        states = new ArrayList<>();
    }

    public void push(Memento state){
        states.add(state);
    }

    public Memento pop(){

        if (states.size() <= 0){
            return new Memento(null);
        }

        Memento memento = states.get(states.size() -2);
        states.remove(states.size()-1);
        return memento;
    }

    public void printLog(){
        states.forEach(System.out::println);
    }
}
