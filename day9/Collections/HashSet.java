package day9.Collections;
import java.util.LinkedHashSet;
public class HashSet {

        public static void main(String[] args){
            LinkedHashSet<String> set=new LinkedHashSet<>();
            set.add("Mango");
            set.add("Apple");
            set.add("Strawberry");
            set.add("Grapes");
            System.out.println(set);
            set.remove("Grapes");
            System.out.println(set);
            System.out.println(set.contains("Grapes"));
            System.out.println(set.contains("Mango"));


        }

    }
