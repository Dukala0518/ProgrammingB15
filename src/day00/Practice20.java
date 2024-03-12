package day00;

import java.util.Arrays;

public class Practice20 {
    public static void main(String[] args) {
        //Return the sum of the numbers in the array, returning 0 for an empty array.
        // Except the number 13 is very unlucky,
        // so it does not count and numbers that come immediately after a 13 also do not count.
        // System.out.println(Sum13(new int[]{1, 2, 3, 13, 1}));

        int[] arr = {1, 1}; //3
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 13) { // i==13, i+1 == 4
                sum = sum + arr[i]; // 5 + 4 == 9;
                if (i > 0 && arr[i - 1] == 13)
                    sum -= arr[i];// sum = sum - arr[i] --> // 9 - 4 = 5
            }
        }
        System.out.println(sum);

    }
}
