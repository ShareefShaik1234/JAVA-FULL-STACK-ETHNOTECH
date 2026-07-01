package Day20.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CC {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(11);
        list.add(33);
        list.add(60);
        list.add(54);

        Collections.sort(list);
        System.out.println(list);
//        Comparator<Integer> com =new Comparator<Integer>()
//        {
//            public int compare(Integer a,Integer b)
//            {
//                if(a%10 > b%10){
//                    return 1;
//
//                }
//                else {
//                    return -1;
//                }
//            }
//
//        };
        Comparator<Integer> com=(a,b)->a%10 > b%10?1:-1;
        Collections.sort(list,com);
        System.out.println(list);


    }
}