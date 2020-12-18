package elements;

public class The extends Boisson {
    @Override
    protected int cost() {
        return 200;
    }

    @Override
    public int getCost(){
        return this.cost();
    }




}
