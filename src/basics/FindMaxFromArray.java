package basics;

public class FindMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 8, 9, 54, 2, 8, 5, 8, 5, 8, 5, 5};

        int result = findMax(arr);

        System.out.println(result);

    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
}