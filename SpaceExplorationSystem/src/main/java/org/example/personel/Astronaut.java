package org.example.personel;

public class Astronaut extends Personel {
    public Astronaut(String name) {
        super(name);
    }


    @Override
    public void performTask() {
        System.out.println(name + " is Flying spaceship");
    }
    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("Additional astronaut raport");
    }
}
