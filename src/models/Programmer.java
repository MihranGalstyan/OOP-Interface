package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Programmer extends Employee implements CodeWritable {
    public Programmer(final String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("I am programming");
    }
}
