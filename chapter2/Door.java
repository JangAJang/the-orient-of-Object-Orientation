package chapter2;

public class Door {

    private float size;

    public Door(float size) {
        this.size = size;
    }

    public boolean isTooSmall(float height){
        return size < height;
    }
}
