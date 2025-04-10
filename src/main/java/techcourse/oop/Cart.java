package techcourse.oop;

import java.util.List;

public class Cart {
    private final List<OrderedItem> orderedOrderedItems;

    public Cart(List<OrderedItem> orderedOrderedItems) {
        this.orderedOrderedItems = orderedOrderedItems;
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (OrderedItem item : orderedOrderedItems) {
            totalPrice += item.getTotalPrice();
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

    public List<OrderedItem> getOrderedOrderedItems() {
        return orderedOrderedItems;
    }
}
