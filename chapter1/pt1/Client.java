package chapter1.pt1;

public class Client {

    private final String id = "username3";
    private final String password = "password3";

    public String[] requestLogIn(){
        return new String[]{id, password};
    }
}
