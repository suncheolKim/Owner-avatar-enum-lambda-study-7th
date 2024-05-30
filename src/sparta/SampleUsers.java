package sparta;

import java.util.ArrayList;
import java.util.List;

public class SampleUsers {
    private final List<User> list;

    public SampleUsers() {
        list = new ArrayList<>(20);
    }

    public void init() {
        list.add(new User("사나", 27, "여성", "일본", "맥도날드", "민초"));
        list.add(new User("아이유", 30, "여성", "한국", "맥도날드", "민초"));
        list.add(new User("케빈", 24, "남성", "미국", "버거킹", "민초"));
        list.add(new User("제니", 28, "여성", "한국", "맥도날드", "반민초"));
        list.add(new User("뷔", 28, "남성", "한국", "맥도날드", "민초"));
        list.add(new User("지수", 29, "여성", "한국", "맥도날드", "반민초"));
        list.add(new User("RM", 29, "남성", "한국", "맥도날드", "민초"));
        list.add(new User("로제", 27, "여성", "뉴질랜드", "맥도날드", "반민초"));
        list.add(new User("제이홉", 30, "남성", "한국", "버거킹", "민초"));
        list.add(new User("리사", 27, "여성", "태국", "버거킹", "반민초"));
        list.add(new User("진", 31, "남성", "한국", "버거킹", "민초"));
        list.add(new User("태연", 35, "여성", "한국", "버거킹", "반민초"));
        list.add(new User("츠키", 20, "여성", "일본", "맥도날드", "민초"));
        list.add(new User("수호", 32, "남성", "한국", "버거킹", "반민초"));
        list.add(new User("화사", 29, "여성", "한국", "버거킹", "민초"));
        list.add(new User("찬열", 31, "남성", "한국", "맥도날드", "반민초"));
        list.add(new User("지코", 31, "남성", "한국", "버거킹", "민초"));
        list.add(new User("솔라", 33, "여성", "한국", "버거킹", "반민초"));
        list.add(new User("은지", 30, "여성", "한국", "버거킹", "민초"));
        list.add(new User("레이", 19, "여성", "중국", "맥도날드", "반민초"));
    }
}
