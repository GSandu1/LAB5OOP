
public class DiabloBurger extends Meat {

    private int gramsOfCheedar;
    private int gramsOfOlives;
    private int gramsOfHotPeppers;
    private int gramsOfProvalone;

    public DiabloBurger() {
        super("thick", 35, 60, 140, true);
        this.gramsOfCheedar = 70;
        this.gramsOfOlives = 40;
        this.gramsOfHotPeppers = 25;
        this.gramsOfProvalone = 100;
    }


    @Override
    public double getPrice() {
        return super.getPrice() + (gramsOfHotPeppers * 0.9 + gramsOfProvalone * 1.2 + gramsOfOlives * 0.95 + gramsOfCheedar * 0.3);
    }

    @Override
    public double costToMake() {
        return super.costToMake();
    }
}