package chapter4.alice.domain.judge;

import java.util.Arrays;

public enum Time {
    TODAY("오늘"), YESTERDAY("어제"), LAST_WEEK("지난 주"), LAST_MONTH("지난 달"), LAST_YEAR("작년");

    private final String message;

    Time(String message) {
        this.message = message;
    }

    private boolean isRightMessage(String message){
        return this.message.equals(message);
    }

    public boolean isInTestimony(String testimony){
        return testimony.contains(this.message);
    }

    public String getMessage() {
        return message;
    }

    public Time getTime(String message){
        return Arrays.stream(Time.values()).filter(i -> i.isRightMessage(message)).findFirst()
                .orElseThrow(()-> new IllegalArgumentException("해당 시간대를 입력받을 수 없습니다."));
    }
}
