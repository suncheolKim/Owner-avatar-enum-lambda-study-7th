package sparta.front;

import sparta.enumtype.DiscountEvent;

public interface FrontPage {
    void display(long price, DiscountEvent event);
}
