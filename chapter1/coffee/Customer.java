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

    public boolean isMyCoffee(String coffeeGiven){
        return this.coffee.equals(coffeeGiven);
    }
}
