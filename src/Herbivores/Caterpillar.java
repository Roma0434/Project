package Herbivores;

import com.company.Animal;

public class Caterpillar extends Herbivores{
    Animal Caterpillar = new Herbivores(0.01,1000,0,0);

    public Animal getCaterpillar() {
        return Caterpillar;
    }

    public void setCaterpillar(Animal caterpillar) {
        Caterpillar = caterpillar;
    }
}
