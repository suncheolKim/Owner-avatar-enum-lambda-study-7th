import sparta.SampleUsers;
import sparta.User;
import sparta.enumtype.DiscountEvent;
import sparta.front.Cart;
import sparta.front.Order;
import sparta.front.ProductDetail;
import sparta.service.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        lambdaTest();
        enumTest();
    }

    private static void enumTest() {
        /**
         *  *************************
         *  ****      시나리오     ****
         *  *************************
         *
         *  1. 2천만원짜리 상품이 있다.
         *  2. 우리 쇼핑몰은 시즌별로 할인율이 각각 다르다.
         *  3. 상품 상세페이지, 장바구니, 주문서까지 모든 화면에서 할인된 가격을 보여줘야 한다.
         */

        final int productPrice = 20_000_000;
        final Product product = new Product("아이폰185 Super Ultra Pro Max", productPrice);

        final ProductDetail productDetail = new ProductDetail();
        final Cart cart = new Cart();
        final Order order = new Order();

        /* 여름 할인 */
        DiscountEvent event = DiscountEvent.SUMMER;
        productDetail.display(productPrice, event);
        cart.display(productPrice, event);
        order.display(productPrice, event);

        /* 겨울 할인 */
        event = DiscountEvent.WINTER;
        productDetail.display(productPrice, event);
        cart.display(productPrice, event);
        order.display(productPrice, event);
    }

    private static void lambdaTest() {
        final SampleUsers users = new SampleUsers();
        users.init();

        List<User> users1 = users.ageGreaterThan(30);
        List<User> users2 = users.ageEquals(30);
        List<User> users3 = users.ageBetween(10, 20);
        List<User> users4 = users.genderEquals("여성");
        List<User> users5 = users.burgerEquals("맥도날드");

        List<User> lUser1 = users.getUsersBy((user) -> user.getAge() > 30);
        List<User> lUser2 = users.getUsersBy((user) -> user.getAge() == 30);
        List<User> lUser3 = users.getUsersBy((user) -> user.getAge() >= 10 && user.getAge() <= 20);
        List<User> lUser4 = users.getUsersBy((user) -> "여성".equalsIgnoreCase(user.getGender()));
        List<User> lUser5 = users.getUsersBy((user) -> "맥도날드".equalsIgnoreCase(user.getBurger()));

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
