package org.example.personel;

public class Engineer extends Personel {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void performTask() {
        System.out.println("Repairing spaceship");
    }

}
