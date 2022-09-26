package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Cat extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Eating cat food");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
