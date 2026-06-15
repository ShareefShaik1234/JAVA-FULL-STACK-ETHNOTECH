package Day02_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int n=arr.length;
        int res[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            res[i]=sum;
        }
        System.out.println(Arrays.toString(res));
    }
}