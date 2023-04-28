package chapter2;

import chapter2.item.Cake;
import chapter2.item.Mushroom;
import chapter2.item.Tea;

public class Alice {

    private float height;
    private Place place;

    public Alice() {
        this.height = 130;
        place = Place.DOOR;
    }

    public boolean isAtGarden(){
        return place.equals(Place.GARDEN);
    }

    public void tryToMove(Door door){
        if(door.isTooSmall(height)){
            return;
        }
        place = Place.GARDEN;
    }

    public void eatCake(Cake cake){
        height = cake.itemUsed(height);
    }

    public void drinkTea(Tea tea){
        if(!tea.isEmpty()){
            throw new IllegalArgumentException("차가 없습니다.");
        }
        height /= 2;
        tea.drunken();
    }

    public void useFan(){
        height -= 20;
    }

    public void eatMushroomToBeTall(Mushroom mushroom){
        if(mushroom.isLeftSideEmpty()){
            throw new IllegalArgumentException("더 커지기 위해 먹을 버섯이 없습니다.");
        }
        mushroom.leftEaten();
        height += 10;
    }

    public void eatMushroomToBeSmall(Mushroom mushroom){
        if(mushroom.isRightSideEmpty()){
            throw new IllegalArgumentException("더 작아지기 위해 먹을 버섯이 없습니다.");
        }
        mushroom.rightEaten();
        height -= 10;
    }

    public float getHeight() {
        return height;
    }
}
