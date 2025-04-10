package techcourse.oop;

import java.util.Arrays;

public enum Menu {
    AMERICANO("아메리카노", 1_500),
    LATTE("라떼", 2_000),
    MOCHA("모카", 2_500),
    CROISSANT("크로와상", 3_000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static Menu fromName(final String name) {
        return Arrays.stream(Menu.values())
                .filter(menu -> menu.name.equals(name))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("해당 이름과 일치하는 음료가 존재하지 않습니다."));
    }
}
