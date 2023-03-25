package chapter1.pt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AuthService {

    private static final List<Member> memberRepository = new ArrayList<>();

    public AuthService() {
        IntStream.range(1, 11).forEach(i -> memberRepository.add(new Member("username"+i, "password"+i)));
    }

    public String logIn(String username, String password){
        System.out.println("사용자는 AuthService에게 로그인 요청을 보낸다. ");
        for(Member member : memberRepository){
            if(member.isRightUsername(username))
                if(member.isRightPassword(password)) {
                    System.out.println("Member에게 받은 응답으로 Client에게 AuthService가 응답을 보낸다.");
                    return "토큰";
                }
        }
        System.out.println("Member에게 받은 응답으로 Client에게 AuthService가 응답을 보낸다.");
        return "예외";
    }
}
