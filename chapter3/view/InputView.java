package chapter3.view;

import chapter3.CommandType;
import chapter3.factory.VehicleType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;

import static chapter3.CommandType.CHECK;
import static chapter3.CommandType.MOVE;
import static chapter3.factory.VehicleType.*;

public class InputView {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int getCarCount() throws IOException{
        System.out.print("자동차의 개수를 입력해주세요 : ");
        String input = br.readLine();
        if(isNotNumber(input) || isEqualOrLessThanZero(input)){
            System.out.println("차의 개수를 다시 입력해주세요.");
            return getCarCount();
        }
        return Integer.parseInt(input);
    }

    public int getEndLocation() throws IOException{
        System.out.print("골인 거리를 입력해주세요 : ");
        String input = br.readLine();
        if(isNotNumber(input) || isEqualOrLessThanZero(input)){
            System.out.println("골인 거리는 0보다 큰 수여야 합니다.");
            return getEndLocation();
        }
        return Integer.parseInt(input);
    }

    public VehicleType getVehicleType() throws IOException{
        System.out.print("자동차의 종류를 입력해주세요 (승용차 / SUV / 레이싱카) : ");
        String input = br.readLine();
        try{
            return VehicleType.getType(input);
        } catch (Exception e){
            System.out.println("잘못된 종류입니다.");
            return getVehicleType();
        }
    }

    public String[] getCarInfo(List<String> names, int end) throws IOException {
        System.out.print("자동차의 정보를 입력해주세요. '이름 위치'로 한 칸 띄어 입력해주세요 : ");
        String[] info = br.readLine().split(" ");
        if(info.length != 2) {
            System.out.println("차에 대한 정보가 전부 입력되지 않았습니다. 다시 입력해주세요.");
            return getCarInfo(names, end);
        }
        if(names.contains(info[0])){
            System.out.println("이미 존재하는 자동차명입니다. 다른 이름을 입력해주세요.");
            return getCarInfo(names, end);
        }
        if(isNotNumber(info[1]) || isEqualOrLessThanZero(info[1]) || isAlreadyAtOrAfterEnd(info[1], end)){
            System.out.println("현재 위치는 0보다 크고 도착지 "+ end +"보다 작은정수로 입력해주어야 합니다. 다시 입력해주세요.");
            return getCarInfo(names, end);
        }
        return info;
    }

    private boolean isAlreadyAtOrAfterEnd(String location, int end) {
        return Integer.parseInt(location) >= end;
    }

    public boolean isNotNumber(String input){
        return !Pattern.matches("^[0-9]*$", input);
    }

    public boolean isEqualOrLessThanZero(String input){
        return Integer.parseInt(input) <= 0;
    }

    public CommandType getNextCommand() throws IOException{
        System.out.print("다음 행동을 입력해주세요(이동 / 검사) : ");
        String command = br.readLine();
        if(MOVE.isRightCommand(command)){
            return MOVE;
        }
        if(CHECK.isRightCommand(command)){
            return CHECK;
        }
        System.out.println("올바르지 않은 입력이 확인되었습니다. 게임을 종료합니다.");
        return getNextCommand();
    }
}
