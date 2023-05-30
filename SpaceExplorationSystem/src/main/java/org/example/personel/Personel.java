package org.example.personel;

public abstract class Personel {
    protected String name;

    public String getName() {
        return name;
    }

    public Personel(String name) {
        this.name = name;
    }

    public abstract void performTask();
    public void reportStatus() {
        System.out.println(name + "REPORTS SOMETHING");
    }
}
