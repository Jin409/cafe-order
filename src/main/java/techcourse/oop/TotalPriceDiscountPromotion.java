package techcourse.oop;

public class TotalPriceDiscountPromotion implements DiscountPromotion {
    private static final int APPLICABLE_STANDARD_PRICE = 15_000;
    private static final int DISCOUNT_PRICE = 1_000;
    private final Cart cart;

    public TotalPriceDiscountPromotion(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean isApplicable() {
        return cart.calculateTotalPrice() > APPLICABLE_STANDARD_PRICE;
    }

    @Override
    public int calculateTotalPrice(int totalPrice) {
        return totalPrice - DISCOUNT_PRICE;
    }
}
