package chapter1.coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

    private final String coffee;

    public Customer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        coffee = br.readLine();
    }

    public String tellCoffee() {
        return coffee;
    }

    public void getCoffee(Cashier cashier){
        if(coffee.equals(cashier.giveCoffeeToCustomer())) {
            System.out.println("제 커피 맞네요 감사합니다.");
            return;
        }
        throw new IllegalArgumentException("제 커피가 아닙니다.");
    }
}
