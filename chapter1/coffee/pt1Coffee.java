package chapter1.coffee;

import java.io.IOException;

public class pt1Coffee {

    public static void main(String[] args)throws IOException{
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        Customer customer = new Customer();
        cashier.getOrderFromCustomer(customer.tellCoffee());
        barista.getOrder(cashier.tellBaristaToMakeCoffee());
        cashier.getCoffeeFromBarista(barista.giveCoffeeMade());
        String coffee = cashier.giveCoffeeToCustomer();
        if(!customer.isMyCoffee(coffee)) throw new IllegalArgumentException();
        System.out.println("제 커피 맞네요 감사합니다.");
    }
}
