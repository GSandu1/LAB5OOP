
public class Meat extends Bun {
    protected int chicken;
    private boolean sausage;


    public Meat(String thickness, int size, int amountOfSouse, int chicken, boolean sausage) {
        super(thickness, size, amountOfSouse);
        this.chicken = chicken;
        this.sausage = sausage;
    }


    @Override
    public double getPrice() {
        return super.getPrice() + (chicken * 1.1);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}