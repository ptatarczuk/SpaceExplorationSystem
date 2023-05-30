package org.example.spaceCrafts;

import org.example.personel.Astronaut;
import org.example.personel.Engineer;
import org.example.personel.Personel;

import java.util.List;

public abstract class Spacecraft {
    private List<Personel> personel;

    public abstract void fly(Astronaut astronaut);
    public abstract void repair(Engineer engineer);

}
