package techcourse.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<OrderedItem> orderedItems = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("주문할 음료의 이름을 입력해주세요");
            String drinkName = scanner.nextLine();
            Menu menu = Menu.fromName(drinkName);

            System.out.println("주문할 수량을 선택해주세요");
            int quantity = Integer.parseInt(scanner.nextLine());

            OrderedItem orderedItem = new OrderedItem(menu, quantity);
            orderedItems.add(orderedItem);
        }

        Cart cart = new Cart(orderedItems);
        int totalPrice = cart.getTotalPrice();
        System.out.println("총 금액: " + totalPrice);
    }
}
