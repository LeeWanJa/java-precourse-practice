package com.codesquad.mission1.object.cafe;

import java.util.HashMap;

public class Cafe {
    private final String name;
    private final HashMap<String, Integer> menu;

    public Cafe(String name) {
        this.name = name;
        this.menu = new HashMap<>();
    }

    public void putMenu(String menuName, int price) {
        menu.put(menuName, price);
    }

    public int getPrice(String item) {
        if(menu.containsKey(item)){
            return menu.get(item);
        }

        return 0;
    }

    public String getName() {
        return name;
    }
}
