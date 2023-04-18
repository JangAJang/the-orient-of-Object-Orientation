package chapter3;

public class Car extends Vehicle{

    private final String name;
    private int location;

    public Car(String name, int location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void move() {
        location +=2;
    }

    @Override
    public String getLocation() {
        return "승용차 "+name + "의 위치는" + location + "입니다.";
    }

    @Override
    public boolean isFinished(int end) {
        return location >= end;
    }
}
