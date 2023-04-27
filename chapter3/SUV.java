package chapter3;

public class SUV extends Vehicle {

    private final String name;
    private int location;

    public SUV(String name, int location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void move() {
        location += 1;
    }

    @Override
    public String getLocation() {
        return "SUV " + name + "의 위치는" + location + "입니다.";
    }

    @Override
    public boolean isFinished(int end) {
        return location >= end;
    }
}
