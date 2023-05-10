package chapter4.alice.domain.judge;

import java.util.Arrays;

public enum Place {

    GARDEN("정원"), PALACE("궁전"), KITCHEN("주방");

    private final String message;

    Place(String message) {
        this.message = message;
    }

    private boolean isRightMessage(String message){
        return this.message.equals(message);
    }

    public boolean isInTestimony(String testimony){
        return testimony.contains(this.message);
    }

    public Place getPlace(String message){
        return Arrays.stream(Place.values()).filter(i-> i.isRightMessage(message)).findFirst()
                .orElseThrow(()-> new IllegalArgumentException("해당 장소를 입력받을 수 없습니다."));
    }
}
