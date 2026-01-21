package com.codesquad.mission1.object.cafe;

public class Customer {
    private final String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void buyCoffee(Cafe cafe, String menuName) {
        int menuPrice = cafe.getPrice(menuName);

        if(menuPrice == 0){
            System.out.println("메뉴가 존재하지 않습니다!");
            return;
        }

        if(money - menuPrice < 0){
            System.out.println(name + "님은 " + (menuPrice - money) + "만큼의 돈이 부족합니다!");
            return;
        }

        money -= menuPrice;

        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다. "
                + cafe.getName() + "에서 " + menuName + "(을/를) 마셨습니다.");
    }
}