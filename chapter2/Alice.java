package chapter2;

public class Alice {

    private int height;
    private Cake cake;
    private Tea tea;
    private Mushroom mushroom;
    private Fan fan;

    public Alice() {
        this.height = 130;
    }

    private void eatCake(){
        height *= 2;
    }

    private void drinkTea(){
        height = 24;
    }

    private void useFan(){
        height -= 20;
    }

    private void eatMushroomToBeTall(){
        height += 10;
    }

    private void eatMushroomToBeSmall(){
        height -= 10;

    }
}
