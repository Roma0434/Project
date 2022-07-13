package Predators;

import Herbivores.Herbivores;
import com.company.Animal;

public class Bear extends Predators {
    Animal Bear = new Predators(500, 5, 2, 80);

    public Animal getBear() {
        return Bear;
    }

    public void setBear(Animal bear) {
        Bear = bear;
    }
}
