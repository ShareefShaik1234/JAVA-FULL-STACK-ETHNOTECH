package day11.WildCards;
import  java.util.List;

public class WildCards {
    public static void myListDisplay(List<?>l) {
        System.out.println(l);
    }

    public static void main(String[] args) {
        myListDisplay(List.of(1,2,3,4,5,6,7,8,9,10));
        myListDisplay(List.of("shareef","shaik"));



    }
}
