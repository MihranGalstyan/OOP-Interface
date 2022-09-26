package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Dog extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Eating dog food");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
