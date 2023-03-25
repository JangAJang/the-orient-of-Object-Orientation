package chapter1.pt1;

public class Client {

    private final String id = "username3";
    private final String password = "password3";

    public String[] requestLogIn(){
        return new String[]{id, password};
    }

    public void getReturn(String returned){
        System.out.println("사용자는 AuthService에게 요청에 대한 응답을 받는다.");
        System.out.println(returned);
    }
}
