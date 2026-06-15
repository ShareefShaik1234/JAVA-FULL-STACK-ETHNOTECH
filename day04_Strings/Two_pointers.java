
package Day04_Strings;
import java.util.Arrays;
public class Two_pointers {



        public static void main(String[] args) {
            int[] arr = {1, 4, 8, 7, 6, 12, 15, 18};
            int target = 20;

            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(arr[left] + " " + arr[right]);
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

