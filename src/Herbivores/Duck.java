package Herbivores;

import com.company.Animal;

public class Duck extends Herbivores{
    Animal Duck = new Herbivores(400, 20, 4, 60);

    public Animal getDuck() {
        return Duck;
    }

    public void setDuck(Animal duck) {
        Duck = duck;
    }
}
