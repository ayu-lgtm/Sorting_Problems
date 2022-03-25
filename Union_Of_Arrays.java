public class Union_Of_Arrays {
    public static void function(int a[], int m, int b[], int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

        }
        while (i < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < n) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            System.out.print(b[j] + " ");
            j++;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6 };

        int brr[] = { 5, 6, 6, 6, 7, 8, 9, 10 };
        
        function(arr, arr.length, brr, brr.length);
    }
}
