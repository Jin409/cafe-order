package techcourse.oop;

import java.util.List;

public class OrderSystem {
    private final Cart cart;
    private final List<DiscountPromotion> discountPromotions;

    public OrderSystem(Cart cart) {
        this.cart = cart;
        this.discountPromotions = List.of(new AmericanoDiscountPolicy(cart), new QuantityDiscountPromotion(cart));
    }

    public int getTotalPrice() {
        int totalPrice = cart.calculateTotalPrice();
        for (DiscountPromotion discountPromotion : discountPromotions) {
            if (discountPromotion.isApplicable()) {
                totalPrice = discountPromotion.calculateTotalPrice(totalPrice);
            }
        }
        return totalPrice;
    }
}
