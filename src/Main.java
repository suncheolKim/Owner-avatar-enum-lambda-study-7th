import sparta.SampleUsers;
import sparta.User;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final SampleUsers users = new SampleUsers();
        users.init();

        List<User> users1 = Collections.emptyList();
        List<User> users2 = Collections.emptyList();
        List<User> users3 = Collections.emptyList();
        List<User> users4 = Collections.emptyList();
        List<User> users5 = Collections.emptyList();

        List<User> lUser1 = Collections.emptyList();
        List<User> lUser2 = Collections.emptyList();
        List<User> lUser3 = Collections.emptyList();
        List<User> lUser4 = Collections.emptyList();
        List<User> lUser5 = Collections.emptyList();

        // 30세 초과
        System.out.println("#####   30세 초과   #####");
        System.out.println("01: " + users1);
        System.out.println("L1: " + lUser1);
        System.out.println();

        // 30세
        System.out.println("#####   30세   #####");
        System.out.println("02: " + users2);
        System.out.println("L2: " + lUser2);
        System.out.println();

        // 10 ~ 20세 사이
        System.out.println("#####   10 ~ 20세 사이   #####");
        System.out.println("03: " + users3);
        System.out.println("L3: " + lUser3);
        System.out.println();

        // 여성
        System.out.println("#####   여성   #####");
        System.out.println("04: " + users4);
        System.out.println("L4: " + lUser4);
        System.out.println();

        // 맥도날드
        System.out.println("#####   맥도날드   #####");
        System.out.println("04: " + users5);
        System.out.println("L4: " + lUser5);
        System.out.println();

        /*
        // 국적
        System.out.println("#####   국적   #####");
        */

        /*
        // 반민초(이단)
        System.out.println("#####   이단   #####");*/
    }
}
