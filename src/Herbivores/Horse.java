package Herbivores;

import com.company.Animal;

public class Horse extends Herbivores {
    Animal Horse = new Animal(400, 20, 4, 60);

    public Animal getHorse() {
        return Horse;
    }

    public void setHorse(Animal horse) {
        Horse = horse;
    }
}
