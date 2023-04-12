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
        if(cake.isLeft()){
            cake.removePortion();
            height *= 2;
        }
    }

    private void drinkTea(){
        if(tea.isLeft()){
            height = 24;
            tea.drunken();
        }
    }

    private void useFan(){
        height -= 20;
    }

    private void eatMushroomToBeTall(){
        if(mushroom.isLeftLeft()){
            mushroom.leftEaten();
            height += 10;
        }
    }

    private void eatMushroomToBeSmall(){
        if(mushroom.isRightLeft()){
            mushroom.rightEaten();
            height -= 10;
        }
    }
}
