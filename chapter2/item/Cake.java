package chapter2.item;

public class Cake implements Item{

    private int portions;

    public Cake(int portions) {
        this.portions = portions;
    }

    private void removePortion(){
        portions--;
    }

    @Override
    public float itemUsed(float height) {
        if(isNotLeft()){
            throw new IllegalArgumentException("케이크가 존재하지 않습니다.");
        }
        removePortion();
        return height*2;
    }

    @Override
    public boolean isNotLeft() {
        return portions <= 0;
    }
}
