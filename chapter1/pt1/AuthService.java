package chapter1.pt1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AuthService {

    private static final List<Member> memberRepository = new ArrayList<>();

    public AuthService() {
        IntStream.range(1, 11).forEach(i -> memberRepository.add(new Member("username"+i, "password"+i)));
    }

    private String logIn(String username, String password){
        for(Member member : memberRepository){
            if(member.isRightUsername(username))
                if(member.isRightPassword(password)) return "토큰";
        }
        return "예외";
    }
}
