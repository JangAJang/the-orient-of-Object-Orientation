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

    public String getLatestCoffee(){
        return coffees.peek();
    }

    public boolean isRightCoffee(String coffee){
        if(coffees.isEmpty()) throw new IllegalArgumentException("등록된 커피가 없습니다.");
        return coffees.peek().equals(coffee);
    }
}
