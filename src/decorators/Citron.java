package decorators;

import elements.Boisson;

public class Citron extends Condiments {
    private Boisson boisson;

    public Citron(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    protected int cost() {
        return 300;
    }

    @Override
    public int getCost() {
        return this.boisson.getCost() + this.cost();
    }
}
