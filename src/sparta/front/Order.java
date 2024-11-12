package sparta.front;

import sparta.enumtype.DiscountEvent;

public class Order implements FrontPage {
    public void requestPayment(Cart cart) {
        System.out.println("Request payment: cart items = [" + cart.getItems() + "]");
    }

    @Override
    public void display(int price, DiscountEvent event) {
        final long totalPrice = calculatePrice(price, event);
        System.out.println("Order :  total price = " + totalPrice);
    }

    private long calculatePrice(int productPrice, DiscountEvent event) {
        return event.calc(productPrice);
    }
}
