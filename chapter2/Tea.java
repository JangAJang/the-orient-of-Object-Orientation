package chapter2;

public class Tea {

    private float liters;

    public Tea(float liters) {
        this.liters = liters;
    }

    public boolean isEmpty(){
        return liters <= 0;
    }

    public void drunken(){
        liters -= 0.2;
    }
}
