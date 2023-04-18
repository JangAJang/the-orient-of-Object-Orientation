package chapter3.view;

import chapter3.Vehicle;

import java.util.List;

public class OutputView {

    public void showWinner(Vehicle vehicle){
        System.out.println("-----우승자-----");
        System.out.println(vehicle.getLocation());
    }

    public void showLocation(List<String> locations){
        System.out.println("-----위치 발표-----");
        for(String location : locations){
            System.out.println(location);
        }
    }
}
