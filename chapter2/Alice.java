package chapter2;

public class Alice {

    private float height;
    private Place place;

    public Alice() {
        this.height = 130;
        place = Place.DOOR;
    }

    private void tryToMove(float door){
        if(height > door){
            System.out.println("아직 키가 커서 문을 통과할 수 없습니다.");
            return;
        }
        place = Place.GARDEN;
    }

    private void eatCake(Cake cake){
        if(cake.isLeft()){
            cake.removePortion();
            height *= 2;
            return;
        }
        throw new IllegalArgumentException("케이크가 없습니다.");
    }

    private void drinkTea(Tea tea){
        if(tea.isLeft()){
            height /= 2;
            tea.drunken();
            return;
        }
        throw new IllegalArgumentException("차가 없습니다.");
    }

    private void useFan(){
        height -= 20;
    }

    private void eatMushroomToBeTall(Mushroom mushroom){
        if(mushroom.isLeftLeft()){
            mushroom.leftEaten();
            height += 10;
            return;
        }
        throw new IllegalArgumentException("더 커지기 위해 먹을 버섯이 없습니다.");
    }

    private void eatMushroomToBeSmall(Mushroom mushroom){
        if(mushroom.isRightLeft()){
            mushroom.rightEaten();
            height -= 10;
            return;
        }
        throw new IllegalArgumentException("더 작아지기 위해 먹을 버섯이 없습니다.");
    }
}
