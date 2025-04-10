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
        return totalPrice;
    }
}
