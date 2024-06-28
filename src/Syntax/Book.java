package Syntax;

public class Book {
    private int id;
    private String name;
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "\t" + name + "\n";
    }
}