package day11.WildCards;

import java.util.List;

public class MyDisplay {

    public static void display(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}