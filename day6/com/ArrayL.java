package day6.com;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.remove(3);
       // arr.clear();


        for(int k=0;k<arr.size();k++){
            System.out.print(arr.get(k)+" ");
        }
    }
}
