package day5.com;

public class SlidingWindow {
    public static void main(String[] args) {
        SubArraySum();

    }
    public static  void SubArraySum(){
        int []arr={2,9,31,-4,21,7};
        int mSum=0;
        int k=3;
        int wSum=0;
        for(int i=0;i<k;i++){
            wSum+=arr[i];
        }


        mSum=wSum;

        for(int i=k;i<arr.length;i++) {
            wSum = wSum - arr[i - k] + arr[i];


            mSum = Math.max(mSum, wSum);
        }
        System.out.print(mSum);
    }



}
