package chapter1.coffee;

import java.io.IOException;

public class pt1Coffee {

    public static void main(String[] args)throws IOException{
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        Customer customer = new Customer();
        cashier.getOrderFromCustomer(customer);
        barista.getOrder(cashier);
        cashier.getCoffeeFromBarista(barista);
        customer.getCoffee(cashier);
    }
}
