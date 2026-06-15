package Day02_Arrays;

public class sort_array {

        public static void main(String[] args) {
            int[] arr = {2, 5, 10, -8, 12, 0, 18, 7, 1, -1, 4};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

