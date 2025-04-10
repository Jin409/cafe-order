package techcourse.oop;

public class QuantityDiscountPromotion implements DiscountPromotion {

    private static final int APPLICABLE_STANDARD_QUANTITY = 5;
    private final Cart cart;

    public QuantityDiscountPromotion(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean isApplicable() {
        return cart.countTotalQuantity() > APPLICABLE_STANDARD_QUANTITY;
    }

    @Override
    public int calculateTotalPrice(int totalPrice) {
        return (int) (totalPrice * 0.9);
    }
}
