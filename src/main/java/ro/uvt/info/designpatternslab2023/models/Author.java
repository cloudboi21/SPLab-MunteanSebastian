package ro.uvt.info.designpatternslab2023.models;

public class Author {

    private final String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}