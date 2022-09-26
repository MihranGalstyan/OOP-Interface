package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Bird extends Animal implements CanRun,Flyable {
    @Override
    public void eat() {
        System.out.println("Eating bird food");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
