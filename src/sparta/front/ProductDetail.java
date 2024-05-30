package sparta.front;

import sparta.enumtype.DiscountEvent;

public class ProductDetail implements FrontPage {
    private String category;
    private String seller;
    private String color;

    @Override
    public void display(long price, DiscountEvent event) {
        final long totalPrice = calculatePrice(price, event);
        System.out.println("ProductDetail :  total price = " + totalPrice);
    }

    private long calculatePrice(long productPrice, DiscountEvent event) {
        long discount;
        switch (event) {
            case NONE -> discount = 0;
            case SUMMER -> discount = (int) (productPrice * 0.1);
            case WINTER -> discount = (int) (productPrice * 0.2);
            case BLACK_FRIDAY -> discount = (int) (productPrice * 0.3);
            case NEW_YEAR -> discount = (int) (productPrice * 0.5);
            default -> discount = 0;
        }

        return discount;
    }
}
