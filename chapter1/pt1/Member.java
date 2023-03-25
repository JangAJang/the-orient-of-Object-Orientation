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
        System.out.println("AuthService는 사용자를 찾아 비밀번호를 검증한다.");
        System.out.println("Member는 AuthService에게 비밀번호가 맞는지 그 응답을 반환한다.");
        return this.password.equals(password);
    }
}
