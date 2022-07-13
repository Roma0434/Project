package Herbivores;

import com.company.Animal;

public class Mouse extends Herbivores{
    Animal Mouse = new Herbivores(0.05,500,1,0.01);

    public Animal getMouse() {
        return Mouse;
    }

    public void setMouse(Animal mouse) {
        Mouse = mouse;
    }
}
