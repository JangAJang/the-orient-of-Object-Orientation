package chapter1.coffee;

public class Cashier {

    private final Coffees orders = new Coffees();

    public void getOrderFromCustomer(String order){
        orders.addNewCoffee(order);
    }

    public String tellBaristaToMakeCoffee(){
        return orders.getLatestCoffee();
    }

    public void getCoffeeFromBarista(String coffee){
        if(!orders.isRightCoffee(coffee)) throw new IllegalArgumentException("커피 잘못만들었잖아!");
    }

    public String giveCoffeeToCustomer(){
        return orders.offerCoffee();
    }
}
