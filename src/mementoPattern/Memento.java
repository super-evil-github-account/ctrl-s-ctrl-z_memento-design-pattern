package mementoPattern;

public class Memento {

    private final String content;

    public Memento(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "content='" + content + '\'' +
                '}';
    }
}
