package chapter3;

public enum CommandType {
    MOVE("이동"), CHECK("검사");

    private final String input;

    CommandType(String input) {
        this.input = input;
    }

    public boolean isRightCommand(String input) {
        return this.input.equals(input);
    }
}
