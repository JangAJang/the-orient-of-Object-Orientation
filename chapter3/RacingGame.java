package chapter3;

import chapter3.controller.RacingController;

import java.io.IOException;

public class RacingGame {

    public static void main(String[] args)throws IOException{
        RacingController racingController = new RacingController();
        racingController.startGame();
    }
}
