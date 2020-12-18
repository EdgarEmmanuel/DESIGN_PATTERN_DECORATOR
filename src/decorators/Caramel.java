package decorators;

import elements.Boisson;

public class Caramel extends Condiments {

    private Boisson boisson;

    public Caramel(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    protected int cost() {
        return 200;
    }

    @Override
    public int getCost() {
        return this.boisson.getCost() + this.cost();
    }
}
