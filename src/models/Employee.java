package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Employee {
    private String name;


    public String getName() {
        return name;
    }

    public Employee(final String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("I am " + name);
    }
}
