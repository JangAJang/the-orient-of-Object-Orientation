package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Mushroom createMushroom()throws IOException {
        System.out.println("버섯을 먹을 수 있는 횟수를 입력해주세요.");
        int portions = parseInt(br.readLine());
        return new Mushroom(portions);
    }

    public Cake createCake()throws IOException{
        System.out.println("케이크를 먹을 수 있는 횟수를 입력해주세요.");
        int portions = parseInt(br.readLine());
        return new Cake(portions);
    }

    public Door createDoor() throws IOException{
        System.out.println("정원으로 가는 문의 높이를 입력해주세요.");
        float size = parseFloat(br.readLine());
        return new Door(size);
    }

    public Tea createTea() throws IOException{
        System.out.println("정원으로 가는 문의 높이를 입력해주세요.");
        float liters = parseFloat(br.readLine());
        return new Tea(liters);
    }

    private int parseInt(String input){
        return Integer.parseInt(input);
    }

    private float parseFloat(String input){
        return Float.parseFloat(input);
    }

    public InputType getNextMove()throws IOException{
        int command = parseInt(br.readLine());
        if(InputType.Cake.isTheValue(command)) {
            return InputType.Cake;
        }
        if(InputType.Fan.isTheValue(command)) {
            return InputType.Fan;
        }
        if(InputType.Tea.isTheValue(command)) {
            return InputType.Tea;
        }
        if(InputType.Mushroom_To_Be_Tall.isTheValue(command)) {
            return InputType.Mushroom_To_Be_Tall;
        }
        return InputType.Mushroom_To_Be_Small;
    }

    public void printStatus(Alice alice, Door door){
        alice.tryToMove(door);
        if(alice.isAtGarden()){
            System.out.println("정원에 도착했습니다.");
            System.exit(0);
        }
        System.out.printf("정원에 아직 도착하지 못했습니다. 현재 키는 .2%f 입니다\n", alice.getHeight());
    }
}
