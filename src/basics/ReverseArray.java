package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] result = reverseArray(arr);

        System.out.println(Arrays.toString(result));

    }

    public static int[] reverseArray(int[] arr) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;

        }

        return arr;

    }

}
