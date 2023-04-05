package chapter1.coffee;

import java.util.ArrayDeque;
import java.util.Queue;

public class Coffees {

    private final Queue<String> coffees = new ArrayDeque<>();

    public void addNewCoffee(String coffee){
        this.coffees.add(coffee);
    }

    public String offerCoffee(){
        return coffees.poll();
    }
}
