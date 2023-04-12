package chapter2;

import java.io.IOException;

public class AliceController {

    private static final View view = new View();
    private Alice alice;
    private Door door;
    private Cake cake;
    private Tea tea;
    private Mushroom mushroom;

    public void start()throws IOException {
        initializeObject();
        while (true) {
            doOrder();
            alice.tryToMove(door);
            view.printStatus(alice, door);
        }
    }

    private void initializeObject()throws IOException{
        alice = new Alice();
        door = view.createDoor();
        cake = view.createCake();
        tea = view.createTea();
        mushroom = view.createMushroom();
    }

    private void doOrder()throws IOException{
        if (view.getNextMove().equals(InputType.Cake)) {
            alice.eatCake(cake);
        }
        if (view.getNextMove().equals(InputType.Tea)) {
            alice.drinkTea(tea);
        }
        if (view.getNextMove().equals(InputType.Mushroom_To_Be_Tall)) {
            alice.eatMushroomToBeTall(mushroom);
        }
        if (view.getNextMove().equals(InputType.Mushroom_To_Be_Small)) {
            alice.eatMushroomToBeSmall(mushroom);
        }
        if (view.getNextMove().equals(InputType.Fan)) {
            alice.useFan();
        }
    }
}
