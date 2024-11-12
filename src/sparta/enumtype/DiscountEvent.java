package sparta.enumtype;

import java.util.function.Function;

public enum DiscountEvent {
    NONE ((price) -> 0),
    SUMMER ((price) -> (int) (price * 0.1)),
    WINTER ((price) -> (int) (price * 0.2)),
    BLACK_FRIDAY ((price) -> (int) (price * 0.3)),
    NEW_YEAR ((price) -> (int) (price * 0.5));

    private final Function<Integer, Integer> discountPolicy;

    DiscountEvent(Function<Integer, Integer> discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Integer calc(int price) {
        return this.discountPolicy.apply(price);
    }
}
