package chapter1.pt1;

public class pt1 {

    private static Client client = new Client();
    private static AuthService authService = new AuthService();

    public static void main(String[] args){
        String[] requestMessage = client.requestLogIn();
        String returnResult = authService.logIn(requestMessage[0], requestMessage[1]);
        client.getReturn(returnResult);
    }
}
