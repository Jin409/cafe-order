package techcourse.oop;

public class CoupleDiscountPromotion implements DiscountPromotion {

    private static final int DISCOUNT_PRICE = 700;
    private static final int APPLICABLE_STANDARD_QUANTITY_OF_DRINK = 2;
    private static final int APPLICABLE_STANDARD_QUANTITY_OF_DESSERT = 1;
    private final Cart cart;

    public CoupleDiscountPromotion(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean isApplicable() {

        int drinkQuantity = 0;
        int dessertQuantity = 0;

        for (OrderedItem orderedItem : cart.getOrderedOrderedItems()) {
            if (!orderedItem.getMenu().equals(Menu.CROISSANT)) {
                drinkQuantity += orderedItem.getQuantity();
                continue;
            }
            dessertQuantity += orderedItem.getQuantity();
        }

        return drinkQuantity >= APPLICABLE_STANDARD_QUANTITY_OF_DRINK
                && dessertQuantity >= APPLICABLE_STANDARD_QUANTITY_OF_DESSERT;
    }

    @Override
    public int calculateTotalPrice(int totalPrice) {
        return totalPrice - DISCOUNT_PRICE;
    }
}
