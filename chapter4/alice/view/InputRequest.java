package chapter4.alice.view;

public enum InputRequest {
    WITNESS_TYPE_REQUEST("생성할 증인을 입력해주세요. (앨리스, 주방장, 모자장수 중 하나로 입력해주세요)"),
    TESTIMONY_REQUEST("해당 증인의 증언을 입력해주세요"),
    WRONG_INPUT("입력이 올바르지 않습니다. 다시 입력해주세요.");

    private final String message;

    private InputRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
