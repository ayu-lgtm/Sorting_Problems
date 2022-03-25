import java.util.Arrays;

public class Sort_A_binary_Array {
    public static void sort(int arr[]) {
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] == 0);
            do {
                j--;
            } while (arr[j] == 1);
            if (i >= j) {
                return;
            }
            swap(arr, i, j);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 };
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
