package techcourse.oop;

public interface DiscountPromotion {
    boolean isApplicable();

    int calculateTotalPrice(int totalPrice);
}
