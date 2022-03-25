import java.util.Arrays;

class Minimum_Difference_In_Array {
    public static void fucntion(int arr[], int n) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res, arr[i] - arr[i - 1]);
        }
        System.out.print(res);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 8, 12, 5, 18 };
        fucntion(arr, arr.length);
    }
}