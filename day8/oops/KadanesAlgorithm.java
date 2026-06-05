package day8.oops;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        int[] arr = {2,-5,1,7,-3,4,-6};

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}