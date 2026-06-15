package Day03;

import java.util.Arrays;

public class Arraydeletion{
    public static void main(String[] args){
        int a[]={10,6,0,18,11,7,24,0,5};
        int target=11;
        int index=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] == target) {
                index = i;
            }
        }
            for(int j=index;j<a.length-1;j++){
                a[j]=a[j+1];
            }

            System.out.print(Arrays.toString(a));
    }
}