package chapter3;

public class RacingCar extends Vehicle {

    private final String name;
    private int location;

    public RacingCar(String name, int location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void move() {
        location += 3;
    }

    @Override
    public String getLocation() {
        return "레이싱카 " + name + "의 위치는" + location + "입니다.";
    }

    @Override
    public boolean isFinished(int end) {
        return location >= end;
    }
}
