import models.*;

import java.util.ArrayList;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        for (final Animal animal : animals) {
            animal.eat();
        }

        dog.run();

        Animal animal = dog;
//        animal.run();
        dog = (Dog) animal;
        dog.run();
        cat.run();

        ArrayList<CanRun> runners = new ArrayList<>();
        runners.add(dog);
        runners.add(cat);
        runners.add(bird);
//        runners.add(fish);
        System.out.println("---------------");

        Programmer programmer1 = new Programmer("Pro1");
        Programmer programmer2 = new Programmer("Pro2");
        Programmer programmer3 = new Programmer("Pro2");

        Driver driver1 = new Driver("Driver1");
        Driver driver2 = new Driver("Driver2");
        Driver driver3 = new Driver("Driver3");

        Cooker cooker1 = new Cooker("Cook1");
        Cooker cooker2 = new Cooker("Cook2");
        Cooker cooker3 = new Cooker("Cook3");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(driver1);
        employees.add(cooker1);

        for (final Employee employee : employees) {
            employee.voice();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        for (final Drivable driver : drivers) {
            driver.drive();
        }
    }
}
