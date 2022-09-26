package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Driver extends Employee implements Drivable {
    public Driver(final String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("I am driving");
    }
}
