package chapter1.coffee;

public class Cashier {

    private final Coffees orders = new Coffees();

    public void getOrderFromCustomer(String order){
        System.out.println(order+" 주문받았습니다!");
        orders.addNewCoffee(order);
    }

    public String tellBaristaToMakeCoffee(){
        System.out.println("A : B씨! " + orders.getLatestCoffee() + "만들어주세요!");
        return orders.getLatestCoffee();
    }

    public void getCoffeeFromBarista(String coffee){
        if(!orders.isRightCoffee(coffee)) throw new IllegalArgumentException("커피 잘못만들었잖아!");
    }

    public String giveCoffeeToCustomer(){
        String coffee = orders.offerCoffee();
        System.out.println("주문하신 "+coffee + "나왔습니다!");
        return coffee;
    }
}
