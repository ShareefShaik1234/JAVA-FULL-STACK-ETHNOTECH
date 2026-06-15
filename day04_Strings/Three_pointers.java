package Day04_Strings;

public class Three_pointers {

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5, 6};
            int[] arr2 = {2, 4, 6, 8, 10};
            int[] arr3 = {2, 3, 6, 9, 12};

            int i = 0, j = 0, k = 0;

            while (i < arr1.length && j < arr2.length && k < arr3.length) {

                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                    System.out.print(arr1[i] + " ");
                    i++;
                    j++;
                    k++;
                } else if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr3[k]) {
                    j++;
                } else {
                    k++;
                }
            }
        }
    }
