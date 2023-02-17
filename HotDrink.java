public class HotDrink extends Product{

    protected double volume;
    protected double temperature;
    protected TypesOfDrink type;

    public HotDrink(String name, double cost, double volume, double temperature, TypesOfDrink type) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume: %f, температура %f, type: %s", this.volume, this.temperature, this.type);
    }
}
