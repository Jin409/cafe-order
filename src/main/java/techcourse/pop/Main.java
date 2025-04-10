package techcourse.pop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = new String[3];
        int[] quantities = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("주문할 음료의 이름을 입력해주세요");
            String drinkName = scanner.nextLine();

            System.out.println("주문할 수량을 선택해주세요");
            int quantity = Integer.parseInt(scanner.nextLine());

            items[i] = drinkName;
            quantities[i] = quantity;
        }

        int totalPrice = CafeOrder.calculateTotalPrice(items, quantities);

        System.out.println("총 금액 : " + totalPrice);
    }
}
