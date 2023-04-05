package chapter1.coffee;

public class Barista {

    private final Coffees coffees = new Coffees();

    public void getOrder(String order){
        coffees.addNewCoffee(order);
    }

    public String giveCoffeeMade(){
        return coffees.offerCoffee();
    }
}
