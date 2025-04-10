package techcourse.oop;

public class OrderedItem {
    private final Menu menu;
    private final int quantity;

    public OrderedItem(Menu menu, int quantity) {
        this.menu = menu;
        if (quantity < 1) {
            throw new IllegalArgumentException("주문 수량은 1개 이상이어야 합니다.");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return menu.getPrice() * quantity;
    }

    public Menu getMenu() {
        return menu;
    }
}
