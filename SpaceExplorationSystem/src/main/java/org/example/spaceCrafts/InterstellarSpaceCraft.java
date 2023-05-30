package org.example.spaceCrafts;

import org.example.personel.Astronaut;
import org.example.personel.Engineer;

public class InterstellarSpaceCraft extends Spacecraft{
    @Override
    public void fly(Astronaut astronaut) {
        System.out.println(astronaut.getName() + " is Flying SpaceCraft");
    }

    @Override
    public void repair(Engineer engineer) {

    }
}
