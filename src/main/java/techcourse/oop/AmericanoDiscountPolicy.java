package techcourse.oop;

public class AmericanoDiscountPolicy implements DiscountPromotion {

    private static final int AMERICANO_DISCOUNT_PRICE = 300;
    private final Cart cart;

    public AmericanoDiscountPolicy(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean isApplicable() {
        return cart.getOrderedOrderedItems().stream()
                .anyMatch(item -> item.getMenu().equals(Menu.AMERICANO));
    }

    @Override
    public int calculateTotalPrice(int totalPrice) {
        int discountedPrice = 0;
        for (OrderedItem item : cart.getOrderedOrderedItems()) {
            if (item.getMenu().equals(Menu.AMERICANO)) {
                discountedPrice += AMERICANO_DISCOUNT_PRICE * item.getQuantity();
            }
        }
        return totalPrice - discountedPrice;
    }
}
