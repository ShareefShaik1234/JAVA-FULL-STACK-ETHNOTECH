package day5.com;

public class Diagonal {
    public static void main(String[] args) {
        BothDiagonals();
    }


    public static  void BothDiagonals(){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;

        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < n; i++) {
            if (i == i) {
                System.out.print(arr[i][i] + " ");
            }
        }

        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1 - i] + " ");
        }
    }
}