package chapter2;

public class Cake {

    private int portions;

    public Cake(int portions) {
        this.portions = portions;
    }

    public void removePortion(){
        portions--;
    }

    public boolean isLeft(){
        return portions > 0;
    }
}
