package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Cooker extends Employee implements Cookable {
    public Cooker(final String name) {
        super(name);
    }

    @Override
    public void cooking() {
        System.out.println("I am cooking");
    }
}
