package HelloWorldApp.JavaInstance;

import java.util.Arrays;
import java.util.List;

public class MethodTT {
    enum Car {
        lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
        private int price;

        Car(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        System.out.println("所有汽车的价格：");
        for (Car c : Car.values()) {
            System.out.println(c + " 需要 " + c.getPrice() + " 千美元。");
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + i * j + "\t");// \t 跳到下一个TAB位置
            }
            System.out.println();
        }

        String[] strings = {"1", "2", "4", "5"};
//        List<String> list = Arrays.asList(strings);
        for (String s: strings) {
            System.out.print(s + "  ");
        }
    }
}
