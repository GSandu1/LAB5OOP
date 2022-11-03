

public class BBQBeconBurger extends Meat {

    private int gramsOfBacon;
    private int gramsOfBbqSouse;

    public BBQBeconBurger() {
        super("thick", 50, 70, 160, true);
        this.gramsOfBacon = 80;
        this.gramsOfBbqSouse = 30;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfBacon * 0.9 + gramsOfBbqSouse * 0.7);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}