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
    public void display(int price, DiscountEvent event) {
        final long totalPrice = calculatePrice(price, event);
        System.out.println("Cart :  total price = " + totalPrice);
    }

    private long calculatePrice(int productPrice, DiscountEvent event) {
         return event.calc(productPrice);
    }

    public String getItems() {
        return Arrays.toString(productList.toArray());
    }
}
