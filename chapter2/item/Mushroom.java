package chapter2.item;

public class Mushroom {

    private int leftBites;
    private int rightBites;

    public Mushroom(int totalBites) {
        this.leftBites = totalBites/2;
        this.rightBites = totalBites/2;
    }

    public boolean isLeftSideEmpty(){
        return leftBites <=0;
    }

    public boolean isRightSideEmpty(){
        return rightBites <= 0;
    }

    public void leftEaten(){
        leftBites--;
    }

    public void rightEaten(){
        rightBites--;
    }
}
