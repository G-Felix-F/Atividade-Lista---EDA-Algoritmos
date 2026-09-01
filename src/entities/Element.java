package entities;

public class Element {
    public String name;
    public int time;
    public Element nextElement;

    public Element (String name, int time) {
        this.name = name;
        this.time = time;
        nextElement = null;
    }
}
