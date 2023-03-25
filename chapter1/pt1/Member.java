package chapter1.pt1;

public class Member {
    private String username;
    private String password;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isRightUsername(String username){
        return this.username.equals(username);
    }

    public boolean isRightPassword(String password){
        return this.password.equals(password);
    }
}
