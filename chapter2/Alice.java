package chapter2;

public class Alice {

    private float height;
    private Place place;

    public Alice() {
        this.height = 130;
        place = Place.DOOR;
    }

    private void tryToMove(Door door){
        if(door.isTooSmall(height)){
            System.out.println("아직 키가 커서 문을 통과할 수 없습니다.");
            return;
        }
        place = Place.GARDEN;
        System.out.println("정원에 도착했습니다.");
        System.exit(0);
    }

    private void eatCake(Cake cake){
        if(!cake.isLeft()){
            throw new IllegalArgumentException("케이크가 없습니다.");
        }
        cake.removePortion();
        height *= 2;
    }

    private void drinkTea(Tea tea){
        if(!tea.isLeft()){
            throw new IllegalArgumentException("차가 없습니다.");
        }
        height /= 2;
        tea.drunken();
    }

    private void useFan(){
        height -= 20;
    }

    private void eatMushroomToBeTall(Mushroom mushroom){
        if(mushroom.isLeftLeft()){
            throw new IllegalArgumentException("더 커지기 위해 먹을 버섯이 없습니다.");
        }
        mushroom.leftEaten();
        height += 10;
    }

    private void eatMushroomToBeSmall(Mushroom mushroom){
        if(mushroom.isRightLeft()){
            throw new IllegalArgumentException("더 작아지기 위해 먹을 버섯이 없습니다.");
        }
        mushroom.rightEaten();
        height -= 10;
    }
}
