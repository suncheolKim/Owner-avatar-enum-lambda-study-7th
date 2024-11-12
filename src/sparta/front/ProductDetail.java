package sparta.front;

import sparta.enumtype.DiscountEvent;

public class ProductDetail implements FrontPage {
    private String category;
    private String seller;
    private String color;

    @Override
    public void display(int price, DiscountEvent event) {
        final long totalPrice = calculatePrice(price, event);
        System.out.println("ProductDetail :  total price = " + totalPrice);
    }

    private long calculatePrice(int productPrice, DiscountEvent event) {
        return event.calc(productPrice);
    }
}
