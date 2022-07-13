package Predators;


import Herbivores.Herbivores;
import com.company.Animal;

public class Eagle extends Predators {
    Animal Eagle = new Predators(6,20,3,1);

    public Animal getEagle() {
        return Eagle;
    }

    public void setEagle(Animal eagle) {
        Eagle = eagle;
    }
}
