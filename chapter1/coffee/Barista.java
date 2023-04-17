package chapter1.coffee;

public class Barista {

    private final Coffees coffees = new Coffees();

    public void getOrder(Cashier cashier){
        String order = cashier.tellBaristaToMakeCoffee();
        System.out.println("B : " + order+ "주문받았습니다!");
        coffees.addNewCoffee(order);
    }

    public String giveCoffeeMade(){
        System.out.println(coffees.getLatestCoffee() + " 만들었습니다!");
        return coffees.offerCoffee();
    }
}
