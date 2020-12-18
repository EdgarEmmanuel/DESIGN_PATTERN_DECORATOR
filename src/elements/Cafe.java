package elements;

public  class Cafe extends Boisson {

    @Override
    protected int cost() {
        return 100;
    }

    @Override
    public int getCost(){
        return this.cost();
    }


}
