package sparta.front;

import sparta.enumtype.DiscountEvent;
import sparta.service.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart implements FrontPage {
    final private List<Product> productList = new ArrayList<>();

    public int addCart(Product product) {
        productList.add(product);

        return productList.size();
    }

    @Override
    public void display(long price, DiscountEvent event) {
        final long totalPrice = calculatePrice(price, event);
        System.out.println("Cart :  total price = " + totalPrice);
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

    public String getItems() {
        return Arrays.toString(productList.toArray());
    }
}
