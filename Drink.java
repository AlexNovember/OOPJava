public class Drink extends Product{

    protected double volume;
    protected TypesOfDrink type;

    public Drink(String name, double cost, double volume, TypesOfDrink type) {
        super(name, cost);
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", объем: %f, тип: %s", this.volume, this.type);
    }
}
