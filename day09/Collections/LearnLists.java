package day9.Collections;

import java.util.ArrayList;

public class LearnLists {
    public static void main(String[] args) {


//    ArrayList<Integer> list = new ArrayList<>(10);
//        System.out.println(list.size());
//
        ArrayList<String> list = new ArrayList<>();
        list.add("Beat it");
        list.add("Despactio");
        list.add("Gangam style");
        list.add("Kolaveri di");
        list.add("Hips Don't like");

        //For loop
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

        }
        System.out.println("---------------------------------------");



       //For each loop
        for(String s: list){
            System.out.println(s);
        }
        System.out.println("---------------------------------------------");



        //pretty print
        System.out.println(list);
        System.out.println("--------------------------------------------");



        //remove
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println("---------------------------------------------");



        //Update
        System.out.println(list.set(2,"Barbie"));
        System.out.println(list);
        System.out.println("---------------------------------------------");


        //Contains-Check element exist or not
        System.out.println(list.contains("Barbie"));


    }
}
