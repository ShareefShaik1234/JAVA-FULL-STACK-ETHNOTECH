package day3;

import java.util.Arrays;
public class leftright{
    public static void main(String[] args){
        int a[]={10,4,8,3};
        int n=a.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
            left[i]=a[i-1]+left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=a[i+1]+right[i+1];
        }
        int a1[]=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=Math.abs(left[i]-right[i]);
        }
        System.out.println(Arrays.toString(a1));
    }
}
