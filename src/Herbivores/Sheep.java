package Herbivores;

import Predators.Predators;
import com.company.Animal;

public class Sheep extends Herbivores{
    Animal Sheep = new Herbivores(6, 20, 3, 1);

    public Animal getSheep() {
        return Sheep;
    }

    public void setSheep(Animal sheep) {
        Sheep = sheep;
    }
}
