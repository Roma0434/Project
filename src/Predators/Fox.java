package Predators;

import Herbivores.Herbivores;
import com.company.Animal;

public class Fox extends Predators {
    Animal Fox = new Predators(8,30,2,2);

    public Animal getFox() {
        return Fox;
    }

    public void setFox(Animal fox) {
        Fox = fox;
    }
}
