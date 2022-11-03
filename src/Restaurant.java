

public class Restaurant {
    private final String name;
    private double rating;
    private double budget;

    public Restaurant(String name, double rating, double budget) {
        this.name = name;
        this.rating = rating;
        this.budget = budget;
    }



    public void setBudget(double budget) {

            this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

 /*   private void fail() {
         {
            System.out.println("No money left to run the restaurant");
            System.exit(0);
        }
    }*/

    public double bills(double workingminutes) {  
        return workingminutes * 4.5;
    }

}
