package Predators;

import Herbivores.Herbivores;
import com.company.Animal;

public class Snake extends Predators {
    Animal Snake = new Predators(15,20,1,3);

    public Animal getSnake() {
        return Snake;
    }

    public void setSnake(Animal snake) {
        Snake = snake;
    }
}
