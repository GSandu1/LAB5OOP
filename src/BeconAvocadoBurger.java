
public class BeconAvocadoBurger extends Meat {

    private int avocado;
    private int gramsOfBacon;
    private int chicken;
    private int gramsOfAmericanCheese;

    public BeconAvocadoBurger() {
        super("thick", 35, 50, 100, false);
        this.avocado = 60;
        this.gramsOfBacon = 30;
        this.gramsOfAmericanCheese= 100;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfBacon * 0.9 + gramsOfAmericanCheese* 0.5 + avocado * 0.3 + chicken * 1.1);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}