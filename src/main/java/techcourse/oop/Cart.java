package techcourse.oop;

import java.util.List;

public class Cart {
    private final List<OrderedItem> orderedOrderedItems;

    public Cart(List<OrderedItem> orderedOrderedItems) {
        this.orderedOrderedItems = orderedOrderedItems;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (OrderedItem item : orderedOrderedItems) {
            totalPrice += item.getTotalPrice();
        }

        if (countTotalQuantity() > 5) {
            return (int) (totalPrice * 0.9);
        }

        return totalPrice;
    }

    public int countTotalQuantity() {
        int totalQuantity = 0;
        for (OrderedItem item : orderedOrderedItems) {
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }
}
