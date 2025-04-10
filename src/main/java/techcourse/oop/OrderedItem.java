package techcourse.oop;

public class OrderedItem {
    private final Menu menu;
    private final int quantity;

    public OrderedItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return menu.getPrice() * quantity;
    }
}
