package mementoPattern;

public class TextEditor {

    private String content;

    public void setContent(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "content='" + content + '\'' +
                '}';
    }

    public Memento createMemento(){
        return new Memento(content);
    }

    public void restore(Memento memento){
        content = memento.getContent();
    }
}
