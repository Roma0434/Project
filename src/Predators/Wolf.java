package Predators;

import Herbivores.Herbivores;
import com.company.Animal;

public class Wolf extends Predators {
    Animal Wolf = new Predators(50,30,3,8);

    public Animal getWolf() {
        return Wolf;
    }

    public void setWolf(Animal wolf) {
        Wolf = wolf;
    }
}
