public class Chocolate extends Product{

    protected int percentageOfCocoa;

    public Chocolate(String name, double cost, int percentageOfCocoa) {
        super(name, cost);
        this.percentageOfCocoa = percentageOfCocoa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Шоколада: %s", this.percentageOfCocoa);
    }
}
