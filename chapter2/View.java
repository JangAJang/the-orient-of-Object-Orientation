package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private Mushroom createMushroom()throws IOException {
        System.out.println("버섯을 먹을 수 있는 횟수를 입력해주세요.");
        int portions = parseInt(br.readLine());
        return new Mushroom(portions);
    }

    private int parseInt(String input){
        return Integer.parseInt(input);
    }

    private float parseFloat(String input){
        return Float.parseFloat(input);
    }

    private Cake createCake()throws IOException{
        System.out.println("케이크를 먹을 수 있는 횟수를 입력해주세요.");
        int portions = parseInt(br.readLine());
        return new Cake(portions);
    }

    private Door createDoor() throws IOException{
        System.out.println("정원으로 가는 문의 높이를 입력해주세요.");
        float size = parseFloat(br.readLine());
        return new Door(size);
    }

    private Tea createTea() throws IOException{
        System.out.println("정원으로 가는 문의 높이를 입력해주세요.");
        float liters = parseFloat(br.readLine());
        return new Tea(liters);
    }
}
