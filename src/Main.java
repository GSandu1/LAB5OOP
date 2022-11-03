import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("BurgerHouse", 5, 10000);
        Customer customer = new Customer();
        BBQBeconBurger BBQBeconBurger = new BBQBeconBurger();
        BeconAvocadoBurger BeconAvocadoBurger = new BeconAvocadoBurger();
        DiabloBurger DiabloBurger = new DiabloBurger();
        BrocoliBurger BrocoliBurger= new BrocoliBurger();
        Cheesburger Cheesburger = new Cheesburger();

        Random rand = new Random();
        double profitDay = 0;
        int workminutes = 480;
        int minute = 0;

        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        while (true) {

            int newCustomers = customer.timeBetweenCustomers(restaurant.getRating());
            System.out.println("Next customer came after " + newCustomers + " minutes");
            minute += newCustomers;

            int randomPizza = rand.nextInt(7) + 1;
            int randomIsWithSomeone = rand.nextInt(2)+1;
            int burgers = 1;
           if (randomIsWithSomeone == 2) {
               burgers = customer.BurgerOrdered(restaurant.getRating());
        }
            int randomTimeTakeWaiter = rand.nextInt(20) + 1;
            minute += randomTimeTakeWaiter;
            if (randomTimeTakeWaiter > 15) {
                System.out.println("Waiter took too long so the customers left");


                System.out.println(randomTimeTakeWaiter + " minutes waisted");
            } else {
                if(randomTimeTakeWaiter <= 5) {
                    System.out.println("Waiter came really quickly and customers were pleasantly surprised");

                }
                minute += randomTimeTakeWaiter;
                System.out.println("Waiter came in " + randomTimeTakeWaiter + " minutes");
                switch (randomPizza) {
                    case 1:
                        System.out.println("The customer ordered " + burgers + " BBQBeconBurger ");

                        System.out.println("The check price was: " + BBQBeconBurger.getPrice() * burgers);
                        profitDay += BBQBeconBurger.getPrice() * burgers;
                        break;
                    case 2:
                        System.out.println("The customer ordered " + burgers + " BeconAvocadoBurger");

                        System.out.println("The check price was: " + BeconAvocadoBurger.getPrice() * burgers);
                        profitDay += BeconAvocadoBurger.getPrice() * burgers;
                        break;
                    case 3:
                        System.out.println("The customer ordered " + burgers + " DiabloBurger ");

                        System.out.println("The check price was: " + DiabloBurger.getPrice() * burgers);
                        profitDay += DiabloBurger.getPrice() * burgers;
                        break;
                    case 4:
                        System.out.println("The customer ordered " + burgers + " BrocoliBurger ");

                        System.out.println("The check price was: " + BrocoliBurger.getPrice() * burgers);
                        profitDay += BrocoliBurger.getPrice() * burgers;
                        break;
                    case 5:
                        System.out.println("The customer ordered " + burgers + " Cheesburger");

                        System.out.println("The check price was: " + Cheesburger.getPrice() * burgers);
                        profitDay += Cheesburger.getPrice() * burgers;
                        break;

                }
               // minute += 15 * (burgers / 2) + (burgers % 2);
                int randomReview = rand.nextInt(3) + 1;
                switch (randomReview){
                    case 1:
                        System.out.println("The customer  left a bad review");

                        break;
                    case 2:
                        System.out.println("The customer left no reviews");
                        break;
                    case 3:
                        System.out.println("The customer  left a good review");

                        break;
                }
            }
            System.out.println("***************\n");
            if(minute > 480) {
                System.out.println("--------------------------------------------");
                System.out.println("Work day ended\n");
                System.out.println("The waiter earned " + waiter.getSalary(workminutes) + " and the cook made" + cook.getSalary(workminutes)+ "\n");
                System.out.println("Bill price for this day: " + restaurant.bills(workminutes)+"\n");
                profitDay -= waiter.getSalary(workminutes) + cook.getSalary(workminutes) + restaurant.bills(workminutes);
              // totalProfit += profitDay;

                System.out.println("Profit for day : " + profitDay );
                System.out.println("--------------------------------------------\n");
               //System.out.println("Total profit so far: " + totalProfit);
                restaurant.setBudget(restaurant.getBudget() + profitDay);

                profitDay = 0;
                minute = 0;

            }
        }

    }
}